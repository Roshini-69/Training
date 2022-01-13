---employee details
create table empdetails(Full_name varchar(20),Manager_id integer, Joining_date date,City varchar(10));
alter table empdetails add emp_id integer;
alter table empdetails add primary key(emp_id);
insert into empdetails(emp_id,Full_name,Manager_id,Joining_date,City) values(101,'Ram',123,current_date,'Hyderabad'),(102,'Siva',124,current_date,'Mumbai'),(103,'Krish',125,current_date,'Pune');
insert into empdetails(emp_id,Full_name,Manager_id,Joining_date,City) values(104,'Dileep',101,current_date,'Mumbai');
select * from empdetails;
---employee salary
create table empsalary (emp_id integer,Project varchar(5),Salary real);
insert into empsalary(emp_id,Project,Salary) values (101,'P1',17000),(102,'P2',22000),(103,'P3',18000);
select * from empsalary;
--1
select emp_id ,full_name from empdetails where manager_id=101;
--2
select count(emp_id) from empsalary where Project ='P1';
--3
select max(salary),min(salary),avg(salary) from empsalary;
--4
select emp_id from empsalary where salary between 10000 and 15000;
--5
select emp_id,salary+5000 as new_salary from empsalary;
--6
select e1.emp_id,e2.emp_id FROM empdetails e1 INNER JOIN empsalary e2 ON e1.emp_id = e2.emp_id;
--7
select upper (Full_name) ,lower (city) from empdetails;
--8
select count(emp_id) from empsalary group by project order by count(emp_id)desc; 
--9
Select * from empdetails where emp_id % 2 != 0;
--10
select salary from empsalary e1 where 2=(select count(distinct salary)from empsalary e2 where e2.salary>e1.salary)
