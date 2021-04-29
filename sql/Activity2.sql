REM   Script: Activity2
REM   Activity2

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

insert all  
  into salesman values (5005, 'Pit Alex', 'London', 11) 
  into salesman values(5006, 'McLyon', 'Paris', 14) 
  INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
  INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
  ;

insert all  
  into salesman values (5005, 'Pit Alex', 'London', 11) 
  into salesman values(5006, 'McLyon', 'Paris', 14) 
  INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
  INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

desc salesman


select * from salesman;

