set search_path to prac;
create table employe(emp_no integer primary key,emp_name varchar(10),office varchar(10),age integer);
insert into employe(emp_no,emp_name,office,age)values
(22,'rosh','bajaj',21),
(27,'sai','microsoft',24),
(18,'bannu','fashion',22);
update employe set office='Doctor' where emp_name='bannu';
create table books(isbn integer primary key,title varchar(15),authors varchar(20),publisher varchar(15) );
insert into books(isbn,title,authors,publisher) values
(220,'the life','chethan','Mcgraw-hill'),
(120,'legend','bhagath','mcgraw-hill'),
(145,'life','chethan','alexander'),
(210,'race','chethan','Mcgraw-hill'),
(240,'the queen','suhas','Mcgraw-hill');

create table loan(emp_no integer,isbn integer ,buydate date);
alter table loan add constraint f1key foreign key (emp_no) references employe(emp_no);
alter table loan add constraint f2key foreign key (isbn) references books(isbn);
insert into loan (emp_no,isbn,buydate) values 
(27,220,'2011-09-12');
--(22,120,'2019-01-24'),
(22,210,'2019-04-18'),
(22,240,'2018-06-19'),
(22,145,'2021-09-09'),
(22,210,'2019-08-07'),
(18,240,'2018-07-19');
delete from loan isbn where isbn=220;
select * from employe;
select * from books;
select * from loan;
alter table loan add constraint pke primary key(buydate);

--a
select emp_name from employe where emp_no in
(select emp_no from loan where isbn in (select isbn from books where publisher='Mcgraw-hill'));

select emp_name from employe e, books b,loan l where l.isbn=b.isbn and l.emp_no=e.emp_no and e.emp_no=l.emp_no 
and b.publisher='Mcgraw-hill';

--b

(select emp_no,count(emp_no) from loan group by emp_no having count(emp_no)>= 
(select count(publisher) from books group by publisher having publisher='Mcgraw-hill')) ;

--c
select emp_name from employe where emp_no in (select emp_no from loan where emp_no in
(select emp_no from loan where isbn in (select isbn from books where publisher='Mcgraw-hill'))
group by emp_no having count (emp_no)>3);
