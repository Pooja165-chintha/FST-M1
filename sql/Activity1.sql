REM   Script: Activity1
REM   Activity1

select * from salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

select * from salesman;

insert into salesman (1,'Pooja','Mycity',1200);

insert into table salesman (1,'Pooja','Mycity',1200);

insert into salesman values(1,'Pooja','Mycity',1200);

select * from salesman;

drop table salesman;

CREATE TABLE salesman ( 
    salesman_id int not null primary key, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

