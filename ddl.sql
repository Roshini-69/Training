--DDL commands
set search_path to information;
select*from students;
alter table studentnew alter column sname type varchar(10);
--"add"
alter table students add age integer;
--"rename"
alter table students rename column studentname to sname; 
alter table students rename to studentnew;
--"drop"
alter table studentnew drop column studentid;
alter table studentnew rename to students;
select * from students;
--update
update students set age=23,pocket_money =26000 where sid=477;
--constrains
alter table students add sid integer;
alter table students alter column sid drop not null;
--PRIMARY KEY 
alter table students add primary key(sid);
alter table students drop constraint students_pkey;