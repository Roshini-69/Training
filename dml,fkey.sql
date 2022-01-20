set search_path to information;
select * from students;

--inserting commands
insert into students(sname,age,sid) values ('Rosh',21,0369),('Bhars',22,0477);
insert into students(sid,sname,age) values (0358,'Rushi',21);
insert into students values ('Naveen',22,762);

--adding new column and adding values (update)
alter table students add column joining_date date default current_date;
alter table students add column pocket_money real;

update students set pocket_money = 20000;
update students set pocket_money = 25000 where sid between 300 and 400;
update students set pocket_money = 26000 where sid in(select sid from students where sid=369);


--where
select sname from students where age=22 and pocket_money=20000;
select sname from students where age=21 and sid>300;
select sname from students where sname like 'R%';
select sname from students where sname like 'N%N';
select sname from students where sname like '_____';
select sname from students where sname like '%i';
select sname from students where age in (20,22);
select sname from students where age between 21 and 22;
select substring (sname,1,3) from students;
select position (a in 'area');
Select REPLACE(sname,'a','A') from students;
select concat(sname,' ',age) as name_age from students;
select (sname ||' '||age) as name_age from students;


--distinct
select distinct age from students;

--limit 3: top 3, offset 3: remining rows except top 3
select * from students limit 3;
select * from students offset 3;
select * from students limit 3 offset 1;

--delete
delete from students where sid=762;

--aggregate functions
select * from students where sid in (select max(sid) from students);

--subqueries
select sid from students where sname in (select sname from students where sname like 'R%');
select sid from students where exists (select sname from students where sname like 'R%');
select * from students where pocket_money =20000 and age in (select age from students where age=22);

--orderby(asc,desc)
select * from students order by sid;
select * from students order by sid desc;
select * from students order by sname,pocket_money;

--groupby
--groups records having identical data
select age,sum(pocket_money) from students group by age; --column that is grouped must also be selected
select age,sum(pocket_money) from students group by age order by sum(pocket_money); 

--having
--having is always used with groupby

select age,sum(pocket_money) from students group by age having age>20; 
select age,sum(pocket_money) from students group by age having age>20 order by sum(pocket_money); 

--DEPARTMENT TABLE--
CREATE TABLE department 
(
    d_id int NOT NULL,
    d_name varchar(10),
    salary integer,
    PRIMARY KEY (d_id),
);
alter table department add column sid integer not null;

--add foreign key
alter table department drop column eid;
alter table department add constraint enjoy foreign key(sid) references students(sid);
alter table department add constraint dep_fkey foreign key(sid) references students(sid);
select * from department;

--remove foreign key
alter table department drop constraint enjoy;

--\d+ tablename : to check foreign keys in cli

--alias : temporary name given within query
select age,sum(pocket_money) as sum_of_pm from students group by age order by sum(pocket_money ); 

