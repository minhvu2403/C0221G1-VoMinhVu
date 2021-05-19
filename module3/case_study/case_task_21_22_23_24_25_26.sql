use case_study;
/*21.	Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” và đã từng lập hợp đồng
 cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019”*/
 CREATE VIEW V_NhanVien as
 SELECT nhanvien. * FROM nhanvien
 JOIN hopdong WHERE nhanvien.dia_chi='Hải Châu'
 AND nhanvien.id_nhan_vien=hopdong.id_nhan_vien
 and year(hopdong.ngay_lam_hop_dong)='2019-12-12'
 GROUP BY nhanvien.id_nhan_vien;
 /*22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các
 Nhân viên được nhìn thấy bởi khung nhìn này*/
 UPDATE nhanvien,v_nhanvien
 SET nhanvien.dia_chi='Liên Chiểu'
  WHERE nhanvien.dia_chi=v_nhanvien.dia_chi;
  /*23.	Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó với Id Khách hàng được truyền vào như là 1 tham số của Sp_1*/
  
  delimiter //
  CREATE PROCEDURE SP_1(id int)
  BEGIN
  DELETE from khachhang
  where khachhang.id_khach_hang=id
  end;
   delimiter //
   call SP_1(2);
   /*24.	Tạo Store procedure Sp_2
 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung,
 với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.*/

 delimiter //
 CREATE PROCEDURE Sp_2( in id_nhan_vien int,
                        in id_khach_hang int,
                        in id_dich_vu int,
                        in ngay_lam_hop_dong date,
                        in ngay_ket_thuc date,
                        in tien_dat_coc int,
                        in tong_tien int)
BEGIN
if id_nhan_vien in (SELECT  DISTINCT id_nhan_vien FROM nhanvien)and
    id_khach_hang in(SELECT DISTINCT id_khach_hang FROM khachhang )and
    id_dich_vu in(SELECT DISTINCT id_dich_vu FROM dichvu)
then 
INSERT INTO hopdong( id_nhan_vien ,id_khach_hang ,id_dich_vu ,ngay_lam_hop_dong , ngay_ket_thuc ,tien_dat_coc ,tong_tien )
  VALUES (id_nhan_vien ,id_khach_hang ,id_dich_vu ,ngay_lam_hop_dong , ngay_ket_thuc ,tien_dat_coc ,tong_tien);
  end if;
  end ; //
  delimiter ;
SELECT * FROM nhanvien;
SELECT * FROM dichvu;
 SELECT * from hopdong;
call Sp_2(4,8,4,'2019-05-08','2019-06-04',350,1600);

/*25.	Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng 
HopDong thì hiển thị tổng số lượng bản ghi còn lại có trong bảng HopDong ra giao diện console của database*/
delimiter //
CREATE TRIGGER trigger_1 AFTER DELETE  on  hopdong for each row
begin
DECLARE tong int;
select  tong =count(old.id_hop_dong) from hopdong;
 select  concat('tong so luong bang ghi',tong) as log into outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log.txt';
end //
delimiter ;
-- cau 26;
delimiter //
CREATE TRIGGER trigger_2
BEFORE UPDATE on hopdong FOR EACH ROW
BEGIN
DECLARE  thong_bao VARCHAR(300);
      set thong_bao='Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
      if(new.hopdong.ngay_ket_thuc-old.hopdong.ngay_lam_hop_dong)<2
      then
      SIGNAL SQLSTATE '4500' SET MESSAGE_TEXT = thong_bao;
      end if;
      end //
    delimiter ;  