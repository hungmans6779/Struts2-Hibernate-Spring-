

/*
  MySQL 中文亂碼處理方式
  參考網址 
  http://avrilnote.pixnet.net/blog/post/4652705-mysql%E4%B8%AD%E6%96%87%E4%BA%82%E7%A2%BC%E7%9A%84%E5%8E%9F%E5%9B%A0


  DateBase 設定：
  Connection URL： jdbc:mysql://localhost:3306/reg?characterEncoding=UTF-8
  Driver Class： com.mysql.jdbc.Driver

*/

 


 CREATE DATABASE reg1 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


 alter database reg character set utf8;

 show variables like '%character%';

/* ---------------------------------------------------------------------------------  */


use reg;


create table admin (
	id int not null primary key auto_increment,
	username varchar(20) not null,
	password varchar(20) not null,
	name varchar(20) not null,
	qx int not null
)CHARACTER SET utf8 COLLATE utf8_unicode_ci;




create table users (
	id int not null primary key auto_increment,
	username varchar(20) not null,
	password varchar(20) not null,
	name varchar(20) not null,
	nic varchar(30) not null,
	sex char(2) not null,
	age int ,
	email varchar(30),
	phone varchar(20),
	selfshow varchar(300)
)CHARACTER SET utf8 COLLATE utf8_unicode_ci;






/* 管理員 */
insert into admin values(1,'aaaa','aaaa','aaaa',1);
insert into admin values(2,'bbbb','bbbb','bbbb',2);
insert into admin values(3,'cccc','cccc','cccc',3);


/* 使用者 */
insert into users  values(1,'aaabbb','aaabbb','aaabbb','aaabbb','女',20,'123@163.com','123456789',' ');





select * from admin;
select * from users;

select * from users where username like 'kevin%';

select * from users where username = 'kevin16';


delete from users where ID = '6';



select * from users order by id desc  limit 0,8;



select * from admin where username = 'kevinAdmin'  and password = '1234';



select * from admin where username = 'root';


select * from admin where id = '5';













