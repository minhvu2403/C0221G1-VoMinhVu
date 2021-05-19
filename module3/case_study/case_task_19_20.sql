use case_stydy;
/*19.Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.*/
   SET SQL_SAFE_UPDATES = 0;
UPDATE dichvudikem SET dichvudikem.gia=dichvudikem.gia*2
WHERE EXISTS(
      SELECT hdct.id_dich_vu_kem_theo,count(hdct.id_dich_vu_kem_theo)as so_lan
           FROM hopdongchitiet hdct
               JOIN hopdong hd on hdct.id_hop_dong=hd.id_hop_dong
			     WHERE year(hd.ngay_lam_hop_dong)=2019
				 AND hdct.id_dich_vu_kem_theo=dichvudikem.id_dich_vu_kem_theo
				 GROUP BY hdct.id_hop_dong_chi_tiet
				 HAVING  so_lan>10
             );
	/*20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, 
    thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.*/ 
    
    SELECT nv.id_nhan_vien,ho_ten ,sdt,email,ngay_sinh,dia_chi ,'nhan vien' as  loai  FROM nhanvien nv UNION ALL
    SELECT kh.id_khach_hang,ho_ten,sdt,email,ngay_sinh,dia_chi,'khach hang' as loai FROM khachhang kh;
    

    
    
    