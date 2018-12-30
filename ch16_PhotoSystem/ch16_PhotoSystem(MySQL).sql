-- Struts2、Hibernate、Spring整合開發技術詳解
-- 第十六章  相簿系統

 use xc;

 show variables like '%character%';

 show tables;

/* ---------------------------------------------------------------------------------  */

/* 使用者表 user  */
create table user(
  userId        int         not null  primary key auto_increment comment '使用者ID',
  userName      varchar(25) not null                             comment '使用者名稱', 
  userPassword  varchar(25) not null                             comment '密碼',
  userSex       varchar(4)                                       comment '性別',
  userBirthday  timestamp null default null                      comment '生日',
  userTelephone varchar(15)                                      comment '電話',
  userEmail     varchar(45)                                      comment '電子郵件',
  userAddress   varchar(20)                                      comment '地址',
  userRemark    varchar(100)                                     comment '簡介'
)CHARACTER SET utf8 COLLATE utf8_general_ci;


drop table user;

show create table user;


insert into user values(null,'kevinhung','12345678','male','2013-03-20T00:00:00+08:00','0986888666','hungmans6779@msn.com','台北市中山區民生東路三段49號4樓','test'); 

delete from user where userId = '1';

select * from user;







/* ---------------------------------------------------------------------------------  */

/* 相冊表 folder  */
create table folder(
  folderId   int         not null  primary key auto_increment comment '相簿ID',
  folderName varchar(12) not null                             comment '相簿名',
  folderInfo varchar(50)                                      comment '相簿說明',
  userId     int                                              comment '使用者ID'
)CHARACTER SET utf8 COLLATE utf8_general_ci;

drop table folder;

show create table folder;



 update folder
    set userId= '1'
  where folderId = '4';


/* ---------------------------------------------------------------------------------  */

/* 圖片表 photo */
create table photo(
  photoId   int not null primary key auto_increment comment '圖片ID',
  photoName varchar(50)                             comment '圖片名稱', 
  photoInfo varchar(200)                            comment '圖片說明',
  folderId  int                                     comment '相簿ID'
)CHARACTER SET utf8 COLLATE utf8_general_ci;

show create table photo;

drop table photo;

/* ---------------------------------------------------------------------------------  */


select * from user;
select * from folder;
select * from photo;





  select * from user where userId = '1';

  select * from folder where folderId = '3';
 
  delete from folder where folderId = '3';


 select b.photoId,b.photoName,b.photoInfo,b.folderId
  from folder a,photo b
 where 1 = 1
  and b.folderId = a.folderId
  and a.userId = '1';



  select * from photo where folderId = '' limit 1;

  select max(photoId) from photo;


  select * from photo where folderId = '2' limit 0,1;

select count(*) from photo where folderId = '2';



