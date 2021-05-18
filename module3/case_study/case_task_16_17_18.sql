USE case_study;
/*16.Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.*/     
  SET SQL_SAFE_UPDATES = 0;
DELETE FROM nhanvien
	 WHERE NOT EXISTS(SELECT hopdong.id_nhan_vien FROM hopdong 
	      WHERE hopdong.ngay_lam_hop_dong BETWEEN '2017-01-1' AND '2019-12-31'
               AND hopdong.id_nhan_vien=nhanvien.id_nhan_vien);
  SET SQL_SAFE_UPDATES = 1;
/*17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
 chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.*/
   SET SQL_SAFE_UPDATES = 0;
UPDATE khachhang,
  (SELECT khachhang.id_khach_hang 
           FROM khachhang 
                INNER JOIN hopdong on khachhang.id_khach_hang=hopdong.id_hop_dong
                GROUP BY khachhang.id_khach_hang
                HAVING count(hopdong.tong_tien)>100000000 AND year(hopdong.ngay_lam_hop_dong)in(2019) ) as Platinium_len_Diamond
                    SET khachhang.id_loai_khach=2
                    WHERE khachhang.id_khach_hang=Platinium_len_Diamond.id_khach_hang;
 SET SQL_SAFE_UPDATES = 1;
 /*18.Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).*/
   SET SQL_SAFE_UPDATES = 0;
   DELETE FROM khachhang 
   WHERE EXISTS(SELECT * FROM hopdong
                  WHERE year(hopdong.ngay_lam_hop_dong)<2016
                  AND khachhang.id_khach_hang=hopdong.id_khach_hang);
    SET SQL_SAFE_UPDATES = 1;