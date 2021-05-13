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
oDate DATE,
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
SELECT * FROM orders;
/*do du lieu*/

INSERT INTO Customer 
VALUES(1,'Minh Quan',10),
      (2,'Ngoc Anh',20),
      (3,'Hong Ha',50);
      
INSERT INTO Orders(oID ,cID ,oDate)
VALUES(1,'1','2006-12-3'),
      (2,'2','2006-3-23'),
      (3,'1','2006-3-16');
 INSERT INTO Product 
 VALUES(1,'May Giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);
 INSERT INTO OrderDetail 
 VALUE(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
 SELECT* FROM customer;
 SELECT* FROM orders;
 SELECT* FROM product;
 SELECT* FROM OrderDetail;
 
 /*truy van du lieu*/
 /*Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào*/
 SELECT cID,cname,cage FROM customer where NOT EXISTS(SELECT cID FROM orders WHERE cID=customer.cID);
 /*Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách*/
 SELECT C.cID,C.cname,C.cage,P.pname ,odQTY FROM customer C INNER JOIN orders O ON C.cID=O.cID INNER JOIN OrderDetail Q on O.oID=Q.oID INNER JOIN product P on Q.pID=P.pID;
 /*Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
 Giá bán của từng loại được tính = odQTY*pPrice)*/
SELECT O.oID,O.oDate ,sum(p.pPrice*D.odQTY ) as'tong tien' FROM Orders O INNER JOIN orderdetail D on O.oID=D.oID INNER JOIN product P ON D.pID=P.pID 
GROUP BY O.oId ;
 