create database QuanLyBanHang;
use QuanLyBanHang;
create table Customer(
cID int primary key,
cName varchar(50),
cAge int
);

create table Orders(
oID  int primary key,
cID int,
oDate date,
oTotalPrice int,
FOREIGN KEY(cID)REFERENCES Customer(cID)
);
create table Product(
pID int primary key,
pName varchar(50),
pPrice int
);
create table OrderDetail(
oID int NOT NULL,
pID int NOT NULL ,
odQTY int,
PRIMARY KEY(oID,pID),
FOREIGN KEY(oID)REFERENCES Orders(oID),
FOREIGN KEY(pID)REFERENCES Product(pID)
);