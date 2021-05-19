USE case_study;
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
          WHERE NOT EXISTS( SELECT hopdong.id_hop_dong WHERE hopdong.ngay_lam_hop_dong BETWEEN '2019-01-01' and '2019-06-31')
          and  EXISTS(SELECT hopdong.id_hop_dong WHERE hopdong.ngay_lam_hop_dong BETWEEN '2019-09-01' and '2019-12-31')
            GROUP BY hopdongchitiet.id_hop_dong_chi_tiet;