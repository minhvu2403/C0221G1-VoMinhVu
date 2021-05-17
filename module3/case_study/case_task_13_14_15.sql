USE case_study;
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
             

/*15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi
 mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.*/
SELECT nhanvien.id_nhan_vien,ho_ten,
trinhdo.ten_trinh_do,
bophan.ten_bo_phan,
nhanvien.sdt,dia_chi,
hopdong.ngay_lam_hop_dong,
count(hopdong.id_nhan_vien) as so_lan
	FROM nhanvien
		INNER JOIN trinhdo on nhanvien.id_trinh_do=trinhdo.id_trinh_do
        INNER JOIN bophan on nhanvien.id_bo_phan=bophan.id_bo_phan
        INNER JOIN hopdong on nhanvien.id_nhan_vien=hopdong.id_nhan_vien
            WHERE year(hopdong.ngay_lam_hop_dong) in(2018,2019)
               GROUP BY hopdong.id_nhan_vien
               HAVING so_lan<=3;