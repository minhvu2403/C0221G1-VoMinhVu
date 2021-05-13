CREATE DATABASE QuanLyNhapXuat;
USE QuanLyNhapXuat;
CREATE TABLE nha_cc(
ma_ncc int PRIMARY KEY AUTO_INCREMENT,
ten_ncc VARCHAR(45) ,
dia_chi VARCHAR(45),
sdt INT
);
CREATE TABLE don_dh(
so_dh int PRIMARY KEY AUTO_INCREMENT,
ngay_dh DATE,
ma_ncc int,
FOREIGN KEY(ma_ncc)REFERENCES nha_cc(ma_ncc)
);
CREATE TABLE vat_tu(
ma_vt INT PRIMARY KEY AUTO_INCREMENT,
ten_vt VARCHAR(45)
);
CREATE TABLE chi_tiet_ddh(
ma_vt int,
so_dh INT,
PRIMARY KEY(ma_vt,so_dh),
FOREIGN KEY(ma_vt)REFERENCES vat_tu(ma_vt),
FOREIGN KEY(so_dh)REFERENCES don_dh(so_dh)
);
CREATE TABLE phieu_nhap(
so_pn INT PRIMARY KEY AUTO_INCREMENT,
ngay_nhap DATE
);
CREATE TABLE chi_tiet_pn(
dg_nhap int,
sl_nhap int,
ma_vt int,
so_pn int,
PRIMARY KEY(ma_vt,so_pn),
FOREIGN KEY(ma_vt)REFERENCES vat_tu(ma_vt),
FOREIGN KEY(so_pn)REFERENCES phieu_nhap(so_pn)
);
CREATE TABLE phieu_xuat(
so_px int PRIMARY KEY AUTO_INCREMENT,
ngay_xuat DATE
);
CREATE TABLE chi_tiet_px(
dg_xuat int,
sl_xuat int,
so_px int,
ma_vt int,
PRIMARY KEY(ma_vt,so_px),
FOREIGN KEY(so_px)REFERENCES phieu_xuat(so_px),
FOREIGN KEY(ma_vt)REFERENCES vat_tu(ma_vt)
);