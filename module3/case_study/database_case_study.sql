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
(1,'Độc Cô Cầu Bại','1700-1-1',2015282890,0905123456,'bai@gmail.com','Sài Gòn '),
(1,'Trương Vô Kỵ','1993-1-1',2015282890,0905654321,'ky@gmail.com','Đà Nẵng'),
(1,'Lý Mạc Sầu','1992-1-1',2015282890,0905222222,'sau@gmail.com','Sài Gòn '),
(3,'Trương Tam Phong','1929-1-1',2015282890,0905144444,'phongo@gmail.com','Sài Gòn '),
(1,'Tống Thanh Thư','1924-1-1',2015282890,0905777777,'thu@gmail.com','Sài Gòn '),
(2,'Mộ Dung Phục','1987-2-2',201922222,0905111111,'phuc@gmail.com','Huế');

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
(1,2,1,'2017-1-11','2021-9-21',100,1500),
(1,3,1,'2018-1-11','2020-1-21',100,1500),
(1,3,1,'2019-4-11','2020-1-21',100,1500),
(2,3,1,'2019-2-11','2020-1-21',100,1500),
(2,3,1,'2016-2-11','2020-1-21',100,1500),
(2,3,1,'2014-2-11','2020-1-21',100,1500),
(3,1,1,'2021-1-11','2021-1-21',100,1500);
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
(2,1,1),
(2,2,2);