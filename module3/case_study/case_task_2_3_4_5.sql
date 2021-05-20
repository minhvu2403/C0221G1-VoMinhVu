USE case_study;
/*2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong
 các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.*/
 SELECT *
	 FROM nhanvien 
		 where ho_ten regexp '[:space:][T|H|K][a-z]*$'
		 AND CHAR_LENGTH(ho_ten) <= 15;
 /*cach 2:*/
 SELECT * 
    FROM nhanvien
       WHERE (ho_ten  LIKE 'H%' OR ho_ten LIKE 'T%' OR ho_ten LIKE 'K%' )AND char_length(ho_ten)<=15;
 /*3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.*/
 SELECT *
 FROM khachhang
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
 SELECT
 khachhang.ho_ten, Count(hopdong.id_hop_dong) as 'so lan dat phong'
   FROM khachhang 
		 INNER JOIN hopdong on hopdong.id_khach_hang=khachhang.id_khach_hang
		 WHERE khachhang.id_loai_khach=1 
		 GROUP BY khachhang.id_khach_hang 
		 ORDER BY Count(hopdong.id_hop_dong) ASC;
/*cach 2*/
SELECT khachhang.ho_ten ,count(hopdong.id_hop_dong)as 'so lan dat phong' 
FROM khachhang 
	 JOIN hopdong on hopdong.id_khach_hang=khachhang.id_khach_hang
	 JOIN loaikhach  on khachhang.id_loai_khach = loaikhach.id_loai_khach 
     WHERE loaikhach.ten_loai_khach='Diamond' 
     GROUP BY khachhang.id_khach_hang 
     ORDER BY Count(hopdong.id_hop_dong) ASC;
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