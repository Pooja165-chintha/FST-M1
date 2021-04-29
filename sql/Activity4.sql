REM   Script: Activity4
REM   Activity4

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

insert all   
  into salesman values (5005, 'Pit Alex', 'London', 11)  
  into salesman values(5006, 'McLyon', 'Paris', 14)  
  INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
  INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

select * from salesman;

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city = 'Paris';

select salesman_id, comission from salesman where salesman_name='Paul Adam';

select salesman_id, commission from salesman where salesman_name='Paul Adam';

alter table salesman add grade int;

select * from salesman;

update salesman set grade=100;

select * from salesman;

