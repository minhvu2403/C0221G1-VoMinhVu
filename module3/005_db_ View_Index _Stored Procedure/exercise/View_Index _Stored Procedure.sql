CREATE DATABASE Product;
USE Product;
CREATE TABLE Products(
Id INT PRIMARY KEY AUTO_INCREMENT,
product_Code VARCHAR(45) ,
product_Name VARCHAR(45),
product_Price DOUBLE,
product_Amount  INT,
product_Description VARCHAR(45),
product_Status  VARCHAR(45)
);
INSERT INTO Products(product_Code ,product_Name,product_Price,product_Amount,product_Description,product_Status)
 VALUES  ( 'SP1','Cam',1200,3,'ngon','con hang'),
         ('SP2','Buoi',1450,6,'ngon','con hang'),
         ('SP3','Man',1600,0,'ngon','het hang'),
          ('SP4','Chuoi',1500,0,'ngon','het hang');
         
/*cau lenh truy van*/
-- tao unique index
CREATE UNIQUE INDEX uni_product on products(product_Code);
-- xoa unique index
DROP INDEX uni_product on products;
-- tao composite index
ALTER TABLE products add index Composite_prduct(product_Name,product_Price);
DROP INDEX Composite_product on products;
EXPLAIN SELECT * FROM products where product_code='SP3';
-- tao view
CREATE VIEW  view_product as  SELECT product_Code, product_Name, product_Price, product_Status FROM products;

SELECT * FROM view_product;

-- chinh sua view
INSERT into view_product( product_Code, product_Name, product_Price, product_Status) VALUES
('SP6','Coc',1300,'con hang'),
('SP7','Du du',1700,'con hang');
-- update view
update view_product set  product_Code  ='SP5' where product_Code ='SP6';

UPDATE products_view SET product_Status='con hang' WHERE productCode='SP3';
DROP VIEW products_view;

-- tao store product
DELIMITER //
CREATE PROCEDURE SelectProductstabledata()
begin
SELECT * FROM products;
end;
DELIMITER;

CALL SelectProductstabledata();
-- xoa procedure
drop proc SelectProductstabledata;
-- tao procedure Insert
delimiter //
CREATE PROCEDURE InsertProductstabledata()
begin
INSERT INTO Products(product_Code ,product_Name,product_Price,product_Amount,product_Description,product_Status)
 VALUES  ( 'SP9','Xoai',1200,3,'ngon','con hang');
end //
delimiter ;


call InsertProductstabledata();
select * from products;
 -- store procedure  sua thong tin san pham id
 delimiter //
 create procedure edittProductstabledata( id_product int)
 begin
 update products
 set
 product_code =  @product_code, 
product_name = @product_name,
product_price = @product_price,
product_amount = @product_amount,
product_description = @product_description,
product_status  = @product_status
where  id_product =id;
end //
 delimiter ;
 set
  @product_code='SP10', 
 @product_name='Chanh',
 @product_price=10000,
 @product_amount=4,
 @product_description='ngon',
 @product_status='con hang';
 set @id=20;
 call edittProductstabledata(@id);
 select * from products
 where id =20;
 select * from products;

delimiter //
create procedure delete_product(in id_product int)
begin
delete from products
where id =id_product;
end //
delimiter ;
set @id =4;
call delete_product(@id);
select * from products;




