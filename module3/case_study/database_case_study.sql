CREATE DATABASE case_study;
USE case_study;
CREATE TABLE ViTri(
id_vi_tri INT PRIMARY KEY AUTO_INCREMENT,
ten_vi_tri VARCHAR(45)
);
CREATE TABLE TrinhDo(
id_trinh_do int PRIMARY KEY AUTO_INCREMENT,
ten_trinh_do VARCHAR(45)
);
CREATE TABLE BoPhan(
id_bo_phan int PRIMARY KEY AUTO_INCREMENT,
ten_bo_phan  VARCHAR(45)
);
CREATE TABLE NhanVien(
id_nhan_vien int PRIMARY KEY AUTO_INCREMENT,
ho_ten VARCHAR(45),
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh DATE,
so_cmnd VARCHAR(45),
luong int,
sdt int,
email VARCHAR(45),
dia_chi VARCHAR(45),
FOREIGN KEY(id_vi_tri) REFERENCES ViTri(id_vi_tri) on update cascade on delete cascade,
FOREIGN KEY(id_trinh_do) REFERENCES TrinhDo(id_trinh_do) on update cascade on delete cascade,
FOREIGN KEY(id_bo_phan) REFERENCES BoPhan(id_bo_phan) on update cascade on delete cascade
);
CREATE TABLE HopDongChiTiet(
id_hop_dong_chi_tiet int PRIMARY key AUTO_INCREMENT,
id_hop_dong int,
id_dich_vu_kem_theo int,
so_luong int,
FOREIGN KEY(id_dich_vu_kem_theo) REFERENCES DichVuDiKem(id_dich_vu_kem_theo) on update cascade on delete cascade,
FOREIGN KEY(id_hop_dong) REFERENCES HopDong(id_hop_dong) on update cascade on delete cascade
);
CREATE TABLE HopDong(
id_hop_dong int PRIMARY KEY AUTO_INCREMENT,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong DATE,
ngay_ket_thuc DATE,
tien_dat_coc int,
tong_tien int,
FOREIGN KEY(id_nhan_vien) REFERENCES NhanVien(id_nhan_vien) on update cascade on delete cascade,
FOREIGN KEY(id_khach_hang) REFERENCES KhachHang(id_khach_hang) on update cascade on delete cascade,
FOREIGN KEY(id_dich_vu) REFERENCES DichVu(id_dich_vu) on update cascade on delete cascade
);

CREATE TABLE KhachHang(
id_khach_hang int PRIMARY KEY AUTO_INCREMENT,
id_loai_khach int,
ho_ten VARCHAR(45),
ngay_sinh DATE,
so_cmnd VARCHAR(45),
sdt int,
email VARCHAR(45),
dia_chi VARCHAR(45),
FOREIGN KEY(id_loai_khach) REFERENCES LoaiKhach(id_loai_khach) on update cascade on delete cascade
);
CREATE TABLE LoaiKhach(
id_loai_khach int PRIMARY KEY AUTO_INCREMENT,
ten_loai_khach VARCHAR(45)
);

CREATE TABLE DichVu(
id_dich_vu int PRIMARY KEY AUTO_INCREMENT,
ten_dich_vu VARCHAR(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da int,
chi_phi_thue int,
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai VARCHAR(45),
FOREIGN KEY(id_loai_dich_vu) REFERENCES LoaiDichVu(id_loai_dich_vu) on update cascade on delete cascade,
FOREIGN KEY(id_kieu_thue) REFERENCES KieuThue(id_kieu_thue)     on update cascade on delete cascade
);

CREATE TABLE LoaiDichVu(
id_loai_dich_vu int PRIMARY KEY AUTO_INCREMENT,
ten_loai_dich_vu VARCHAR(45)
);
CREATE TABLE KieuThue(
id_kieu_thue int PRIMARY KEY AUTO_INCREMENT,
ten_kieu_thue VARCHAR(45),
gia int
);

CREATE TABLE DichVuDiKem(
id_dich_vu_kem_theo int PRIMARY KEY AUTO_INCREMENT,
ten_dich_vu_kem_theo VARCHAR(45),
gia int,
don_vi VARCHAR(45),
trang_thai_kha_dung VARCHAR(45)
);
/*do du lieu vao database*/
insert into ViTri(ten_vi_tri)
values 
('Lễ Tân '),
('Phục Vụ '),
('Chuyên Viên '),
('Giám Sát'),
('Quản Lý '),
('Giám Đốc')
;
insert into TrinhDo(ten_trinh_do)
values
('Trung Cấp'),
('Cao Đẳng'),
('Đại Học'),
('Sau Đại Học')
;
insert into BoPhan(ten_bo_phan)
values
('Sale – Marketing'),
('Hành Chính'),
('Phục vụ'),
('Quản Lý');
insert into NhanVien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmnd,luong,sdt,email,dia_chi)
value
('Nguyen Thi Hoa',1,1,3,'1990-12-12',201535456,300,0905222321,'A@gmail.com','Đà Nẵng'),
('Nguyen Van Bao',1,1,3,'1990-12-12',201535456,300,0905222321,'B@gmail.com','Sài Gòn'),
('Nguyen Thi Ly',5,3,4,'1987-12-12',201534444,10000,0905123456,'C@gmail.com','Hà Tĩnh'),
('Truong Van Teo',5,3,4,'1987-12-12',201534449,10000,0905123956,'D@gmail.com','Quảng Bình');

insert into LoaiKhach(ten_loai_khach)
values
('Diamond'), 
('Platinium'), 
('Gold'), 
('Silver'), 
('Member');

insert into KhachHang(id_loai_khach,ho_ten,ngay_sinh,so_cmnd,sdt,email,dia_chi)
values
(1,'Độc Cô Cầu Bại','1700-1-1',2015282890,0905123456,'bai@gmail.com','Quảng Ngãi '),
(1,'Trương Vô Kỵ','1993-1-1',2015282890,0905654321,'ky@gmail.com','Đà Nẵng'),
(1,'Lý Mạc Sầu','1992-1-1',2015282890,0905222222,'sau@gmail.com','Vinh '),
(3,'Trương Tam Phong','1929-1-1',2015282890,0905144444,'phongo@gmail.com','Sài Gòn '),
(1,'Tống Thanh Thư','1924-1-1',2015282890,0905777777,'thu@gmail.com','Quảng Ngãi '),
(2,'Mộ Dung Phục','1987-2-2',201922222,0905111111,'phuc@gmail.com','Huế'),
(5,'Nguyen Van hoa','1993-2-1',2015282890,0560512456,'hoa@gmail.com','Vinh ');

insert into KieuThue(ten_kieu_thue,gia)
values 
('Năm','10000'),
('Tháng','1200'),
('Ngày','200'),
('Giờ','50');

insert into LoaiDichVu(ten_loai_dich_vu)
values 
('Villa'),
('House'),
('Room');
insert into DichVu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values 
('Tuyệt Vời ',100,2,20,1000,2,1,'Còn Phòng'),
('Thoải Mái ',50,6,15,600,1,2,'Còn Phòng');

insert into HopDong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien)
values
(1,1,1,'2021-2-2','2021-2-21',200,2000),
(1,2,2,'2017-1-11','2021-9-21',100,1500),
(1,3,1,'2019-10-11','2020-1-21',100,1500),
(1,4,2,'2019-12-11','2020-1-21',100,1500),
(2,5,1,'2019-2-11','2020-1-21',100,1500),
(2,4,2,'2016-2-11','2020-1-21',100,1500),
(2,3,1,'2014-2-11','2020-1-21',100,1500),
(2,6,2,'2019-11-11','2021-2-21',200,2000),
(3,2,2,'2021-1-11','2021-1-21',100,1500);


insert into DichVuDiKem(ten_dich_vu_kem_theo,gia,don_vi,trang_thai_kha_dung)
values 
('Massage',15,'USD','Đang khả dụng'),

('karaoke',20,'USD','Đang khả dụng'),

('Thức ăn',30,'USD','Đang khả dụng'),

('Nước uống',1,'USD','Đang khả dụng'),

('xe',100,'USD','Đang khả dụng');

insert into HopDongChiTiet(id_hop_dong,id_dich_vu_kem_theo,so_luong)
values
(1,2,2),
(2,2,2),
(3,1,1),
(4,2,2),
(8,2,2);

/*try van*/
/*2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong
 các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.*/
 SELECT * FROM nhanvien 
	 where ho_ten regexp '[:space:][T|H|K][a-z]*$'
	 AND CHAR_LENGTH(ho_ten) < 15;
 /*cach 2:*/
 SELECT * 
    FROM nhanvien
       WHERE (ho_ten  LIKE 'H%' OR ho_ten LIKE 'T%' OR ho_ten LIKE 'K%' )AND char_length(ho_ten)<15;
 /*3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.*/
 SELECT * FROM khachhang
	 WHERE (year(now())-year(ngay_sinh)>18)
	  and  (year(now())-year(ngay_sinh)<50) 
	  AND (dia_chi IN ('Đà Nẵng','Quảng Trị'));
 /*cach 2*/
 SELECT * 
   FROM khachhang
	 WHERE (timestampdiff(YEAR,ngay_sinh,curdate())>18
	 and timestampdiff(YEAR,ngay_sinh,curdate())<50)
	 and (dia_chi in('Đà Nẵng','Quảng Trị'));
 /*4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
 Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.*/
 SELECT khachhang.ho_ten, Count(hopdong.id_hop_dong) as 'so lan dat phong'
 FROM khachhang 
	 INNER JOIN hopdong on hopdong.id_khach_hang=khachhang.id_khach_hang
	 WHERE khachhang.id_loai_khach=1 
     GROUP BY khachhang.id_khach_hang 
     ORDER BY so_lan_dat_phong ASC;
/*cach 2*/
SELECT khachhang.ho_ten ,count(hopdong.id_hop_dong)as 'so lan dat phong' 
FROM khachhang 
	 JOIN hopdong on hopdong.id_khach_hang=khachhang.id_khach_hang
	 JOIN loaikhach  on khachhang.id_loai_khach = loaikhach.id_loai_khach 
     WHERE loaikhach.ten_loai_khach='Diamond' 
     GROUP BY khachhang.id_khach_hang 
     ORDER BY so_lan_dat_phong ASC;
/*5.Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, 
TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).*/
SELECT
	 khachhang.id_khach_hang,ho_ten,
	 loaikhach.ten_loai_khach,
	 hopdong.id_hop_dong,
	 dichvu.ten_dich_vu,
	 hopdong.ngay_lam_hop_dong,ngay_ket_thuc,
	 sum(chi_phi_thue+so_luong*gia) as tong_tien
 FROM khachhang 
	 LEFT JOIN loaikhach on khachhang.id_loai_khach=khachhang.id_loai_khach
	 LEFT JOIN hopdong on khachhang.id_khach_hang=hopdong.id_khach_hang
	 LEFT JOIN dichvu on hopdong.id_dich_vu=dichvu.id_dich_vu
	 LEFT JOIN hopdongchitiet on hopdong.id_hop_dong=hopdongchitiet.id_hop_dong
	 LEFT JOIN dichvudikem on hopdongchitiet.id_dich_vu_kem_theo=dichvudikem.id_dich_vu_kem_theo
	 GROUP BY hopdong.id_hop_dong  
	 ORDER BY khachhang.id_khach_hang ASC;
 /*6.Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, 
 TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).*/
 SELECT dichvu.id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,
 loaidichvu.ten_loai_dich_vu 
    FROM dichvu
		 LEFT JOIN loaidichvu on dichvu.id_loai_dich_vu=loaidichvu.id_loai_dich_vu
		 LEFT JOIN hopdong on hopdong.id_dich_vu=dichvu.id_dich_vu
		 WHERE ( (year(hopdong.ngay_lam_hop_dong)>=2019) and month(hopdong.ngay_lam_hop_dong) in(1,2,3));

 /*7.Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
	của tất cả các loại dịch vụ đã từng được Khách hàng 
 đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.*/

 SELECT dichvu.id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,
 loaidichvu.ten_loai_dich_vu
	 FROM dichvu
		 LEFT JOIN loaidichvu on loaidichvu.id_loai_dich_vu=dichvu.id_loai_dich_vu
		 LEFT JOIN hopdong on hopdong.id_dich_vu=dichvu.id_dich_vu
		 WHERE (year(hopdong.ngay_lam_hop_dong)=2018) AND NOT year(hopdong.ngay_lam_hop_dong)=2019;
 /*cach xoa noi dung bang khi co khoa ngoai)*/
 SET SQL_SAFE_UPDATES = 0;
 DELETE FROM hopdong;
 SET SQL_SAFE_UPDATES = 1;
 /*8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
*/
SELECT DISTINCT khachhang.ho_ten
	FROM khachhang;
-- cach 2
SELECT khachhang.ho_ten
	FROM khachhang
	GROUP BY khachhang.ho_ten;
-- cach 3
SELECT khachhang.ho_ten
	FROM khachhang UNION
	SELECT khachhang.ho_ten
	FROM khachhang ;

/*9.Thực hiện thống kê doanh thu theo tháng, 
nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.*/
SELECT month(hopdong.ngay_lam_hop_dong) as 'so thang',
	count(month(hopdong.ngay_lam_hop_dong)) as'so khach da dat phong'
	   FROM hopdong
	        WHERE hopdong.ngay_lam_hop_dong=2019
              GROUP BY month(hopdong.ngay_lam_hop_dong);
/*10.Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
 Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem
 (được tính dựa trên việc count các IDHopDongChiTiet).*/   
 SELECT hopdong.id_hop_dong,
 ngay_lam_hop_dong,
 ngay_ket_thuc,
 tien_dat_coc,
count(hopdongchitiet.id_hop_dong_chi_tiet) as 'so luong dich vu kem theo'
	FROM hopdong
		INNER JOIN hopdongchitiet on hopdongchitiet.id_hop_dong=hopdong.id_hop_dong
		INNER JOIN dichvudikem on dichvudikem.id_dich_vu_kem_theo=hopdongchitiet.id_dich_vu_kem_theo
		 GROUP BY hopdong.id_hop_dong;

 /*11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
và có địa chỉ là “Vinh ” hoặc “Quảng Ngãi”.*/
 SELECT khachhang.ho_ten,
 loaikhach.id_loai_khach,ten_loai_khach,
 dichvudikem.ten_dich_vu_kem_theo,
 khachhang.id_khach_hang,
 khachhang.dia_chi
	FROM dichvudikem
       INNER JOIN hopdongchitiet on hopdongchitiet.id_dich_vu_kem_theo=dichvudikem.id_dich_vu_kem_theo
       INNER JOIN hopdong on hopdongchitiet.id_hop_dong=hopdong.id_hop_dong
       INNER JOIN khachhang on hopdong.id_khach_hang=khachhang.id_khach_hang
       INNER JOIN loaikhach on khachhang.id_loai_khach=loaikhach.id_loai_khach
         WHERE (loaikhach.ten_loai_khach='Diamond')
          AND  khachhang.dia_chi in ('Quảng Ngãi','Vinh');

 /*12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, 
 TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), 
 TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019
 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.*/
 SELECT 
 hopdong.id_hop_dong,
 khachhang.id_khach_hang,
 nhanvien.ho_ten as 'ten nhan vien',
 khachhang.ho_ten as 'ten khach hang',
 khachhang.sdt,
 dichvu.ten_dich_vu,
 count(hopdongchitiet.id_hop_dong_chi_tiet) as 'so luong dich vu di kiem',
 hopdong.tien_dat_coc
      FROM hopdong 
          INNER JOIN nhanvien on hopdong.id_nhan_vien=nhanvien.id_nhan_vien
          INNER JOIN khachhang on hopdong.id_khach_hang=khachhang.id_khach_hang
          INNER JOIN dichvu on hopdong.id_dich_vu =dichvu.id_dich_vu
          INNER JOIN hopdongchitiet on hopdong.id_hop_dong=hopdongchitiet.id_hop_dong
          INNER JOIN dichvudikem on hopdongchitiet.id_dich_vu_kem_theo=dichvudikem.id_dich_vu_kem_theo
             WHERE year(hopdong.ngay_lam_hop_dong)=2019
			 AND month(hopdong.ngay_lam_hop_dong)IN (10,11,12)
             AND NOT month(hopdong.ngay_lam_hop_dong)IN (1,2,3,4,5,6)
             GROUP BY hopdongchitiet.id_hop_dong_chi_tiet;
 
/*13.Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
 (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).*/
 
 SELECT 
 dichvudikem.id_dich_vu_kem_theo,
 dichvudikem.ten_dich_vu_kem_theo,
 count(dichvudikem.id_dich_vu_kem_theo) as so_lan_su_dung
 FROM dichvudikem
      JOIN hopdongchitiet on hopdongchitiet.id_dich_vu_kem_theo=dichvudikem.id_dich_vu_kem_theo
      GROUP BY dichvudikem.id_dich_vu_kem_theo
      HAVING count(dichvudikem.id_dich_vu_kem_theo)
      =(SELECT max(so_lan_su_dung)
           FROM (SELECT ten_dich_vu_kem_theo ,count(dichvudikem.id_dich_vu_kem_theo)as so_lan_su_dung 
                         FROM dichvudikem
                               JOIN hopdongchitiet on dichvudikem.id_dich_vu_kem_theo=hopdongchitiet.id_dich_vu_kem_theo
                               GROUP BY dichvudikem.id_dich_vu_kem_theo ) as t);
 
     /*14.Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
 Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.*/    
 SELECT
 hopdong.id_hop_dong,
loaidichvu.ten_loai_dich_vu,
dichvudikem.ten_dich_vu_kem_theo,
count(dichvudikem.id_dich_vu_kem_theo) as so_lan_su_dung
    FROM dichvudikem
      INNER JOIN hopdongchitiet on dichvudikem.id_dich_vu_kem_theo=hopdongchitiet.id_dich_vu_kem_theo
      INNER JOIN hopdong on hopdongchitiet.id_hop_dong=hopdong.id_hop_dong
      INNER JOIN dichvu on hopdong.id_dich_vu=dichvu.id_dich_vu
      INNER JOIN loaidichvu on dichvu.id_loai_dich_vu=loaidichvu.id_loai_dich_vu
         GROUP BY dichvudikem.id_dich_vu_kem_theo
         HAVING so_lan_su_dung=1;
        



