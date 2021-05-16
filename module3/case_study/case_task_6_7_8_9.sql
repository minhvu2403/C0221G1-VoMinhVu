USE case_study;
/*6.Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, 
 TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).*/
 SELECT 
 dichvu.id_dich_vu,ten_dich_vu,
 dien_tich,chi_phi_thue,
 loaidichvu.ten_loai_dich_vu 
		FROM dichvu
			 LEFT JOIN loaidichvu on dichvu.id_loai_dich_vu=loaidichvu.id_loai_dich_vu
			 LEFT JOIN hopdong on hopdong.id_dich_vu=dichvu.id_dich_vu
			 WHERE ( (year(hopdong.ngay_lam_hop_dong)>=2019) and month(hopdong.ngay_lam_hop_dong) in(1,2,3));

 /*7.Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
	của tất cả các loại dịch vụ đã từng được Khách hàng 
 đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.*/

 SELECT
 dichvu.id_dich_vu,ten_dich_vu,
 dien_tich,so_nguoi_toi_da,
 chi_phi_thue,
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