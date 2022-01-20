create table employe1(eid int,department varchar(10));
insert into employe1 values(101,'Dev'),(102,'Operations'),(103,'support'),(120,'DS'),
(121,'testing'),(122,'Management');


create table Employ1(eid int ,ename varchar(10),age int,joining_date date,salary real);
insert into employ1 values
(102,'shreya',23,'2022-01-13',300000),
(101,'sid',22,'2022-01-13',50000),
(103,'ram',22,'2022-01-13',40000),
(111,'vinay',23,'2022-01-13',30000),
(107,'rosh',22,'2022-01-13',90000),
(108,'sai',22,'2022-01-13',85000),
(109,'srija',23,'2022-01-13',87000);

--inner join
select employ1.ename,employe1.department from employ1 inner join employe1 on employ1.eid=employe1.eid;
--inner join with alias
select e.ename,e1.department from employ1 e inner join employe1 e1 on e.eid=e1.eid;
--inner join with "using"
select employ1.ename,employe1.department from employ1 inner join employe1 using (eid);
--inner join using "where"
select employ1.ename,employe1.department from employ1 inner join employe1 using (eid) where department ='Dev' ;

create table designation (des_id int,des_details varchar(15));
insert into designation(des_id,des_details) values (101,'training'),(102,'project'),(103,'opn_project');

select * from employe1;
select * from employ1;
select * from designation;

--inner join of 3 tables
select employ1.ename,employe1.department,designation.des_details 
from employ1 inner join employe1 using (eid) inner join designation on employe1.eid=designation.des_id;


---left join---
--table1 join table2
--same no.of records as in table1
select employ1.ename,employe1.department from employ1 left join employe1 on employ1.eid=employe1.eid;

--alias
select e.ename,e1.department from employ1 e left join employe1 e1 on e.eid=e1.eid;


---right join---
--table1 join table2
--same no.of records as in table2
select employ1.ename,employe1.department from employ1 right join employe1 on employ1.eid=employe1.eid;


--full join
select employ1.ename,employe1.department from employ1 full join employe1 on employ1.eid=employe1.eid;

--union
select employ1.ename,employe1.department from employ1 inner join employe1 on employ1.eid=employe1.eid
union
select employ1.ename,employe1.department from employ1 left join employe1 on employ1.eid=employe1.eid;

--intersect
select employ1.ename,employe1.department from employ1 inner join employe1 on employ1.eid=employe1.eid
intersect
select employ1.ename,employe1.department from employ1 left join employe1 on employ1.eid=employe1.eid;

--cross join
--no.of records=product of no.of records
--6*3
select eid,department from employe1 cross join designation;
select eid,department from designation cross join employe1;

--self join
select e.ename,f.ename from employ1 e inner join employ1 f on e.eid=f.eid;
select e.ename, er.ename, e.salary from employ1 e inner join employ1 er on e.salary = er.salary;

--function
--non parameterised 
create or replace  function total_emp()
returns integer as 
$$
declare total integer;
begin
select count(*) into total from employ1;
return total;
end;
$$
language plpgsql;

select total_emp()

--parameterised 
create or replace function sum (a integer,b integer)
returns integer as
$$
begin 
return a + b;
end;
$$
language plpgsql;

select sum(2,3)


create or replace function display ()
returns text as
$$
begin 
return 'hoiii';
end;
$$
language plpgsql;
select display()

-------trigger concept--------
create table employee2(id int primary key not null, name text, salary int not null);
create table audit(id int not null, name text not null, entry_date text);

-- now we will create a function such that as soon as any value inserted 
--this trigger should run with help of function
create or replace function audit_log()
returns trigger as $$
begin
insert into audit(id , name, entry_date) values (new.id,new.name,current_timestamp);
return new;--refers trigger
end;
$$ language plpgsql;

--- creating trigger
create trigger audit_trigger after insert on employee2
for each row execute procedure audit_log();

-- now to check if our trigger is working
insert into employee2 values (140,'Siddharth',389000);
insert into employee2 values (141,'Sid',399000);

select * from audit;
select * from employee2;

--when value is inserted in employee table it will get triggered and value gets inserted in audit too
--as per audit_trigger

create or replace function audit_insert()
returns trigger as $$
begin
RAISE NOTICE 'Inserted';
return new;
end;
$$ language plpgsql;

--to drop trigger
drop trigger audit_trigger on employee2;


--to create index
create index index_new on employee2("name");
--explain keyword
explain select * from employee2 where name='rosh';
--Seq Scan on employee2  (cost=0.00..1.02 rows=1 width=40)

--drop index
drop index index_new;

--hash index
create index index_new on employee2 using hash("name");


--importing data from csv file
alter table imex add city text;
alter table imex add company_name text;
alter table imex add address text;
select * from imex;
