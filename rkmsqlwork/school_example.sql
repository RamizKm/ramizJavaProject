select * from users;

select * from school;

create table rkmexample (
rkmid int
);

select * from rkmexample;

drop table rkmschool;
create table rkmschool (
rkmid int,
rkmschlname varchar(100),
rkmschladdr varchar(100),
rkmcity     varchar(100)
);

alter table rkmschool add primary key (rkmid,rkmschlname);

insert into rkmschool(rkmid,rkmschlname) values (1,'rkmschool');

select * from rkmschool;

create table rkmstudent (
studentid varhar2(100),
stdfname varchar2(100),
stdmname varchar2(100),
stdlname varchar2(100),
stddateofbirth varchar2(100));


alter table rkmstudent add constraint primary key (studentid,stdfname,stddateofbirth);