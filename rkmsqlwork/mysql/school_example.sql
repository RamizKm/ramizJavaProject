--refere mail for details

use test;
--Oracle 11g Express Edition
-- Put your Oracle SQL statement here and execute it

select * from users;

select * from school;

drop table rkmexample;
create table rkmexample (
rkmid int
);

select * from rkmexample;

drop table rkmschool;
create table rkmschool (
rkmid integer not null,
rkmschlname varchar(100),
rkmschladdr varchar(100),
rkmcity     varchar(100)
);

alter table rkmschool add primary key (rkmid,rkmschlname);

insert into rkmschool(rkmid,rkmschlname) values (1,'rkmschool');

select * from rkmschool;

drop table rkmstudent;

create table rkmstudent (
studentid varchar(100) not null,
stdfname varchar(100) not null,
stddateofbirth varchar(100) not null,
stdmname varchar(100),
stdlname varchar(100)

);


alter table rkmstudent add constraint primary key (studentid,stdfname,stddateofbirth);

insert into rkmstudent(studentid,stdfname,stddateofbirth) values ('rkm123','rkm fist','rkm first mname');

--desc rkmstudent;

drop table aulog;

create table aulog (
auid integer not null,
acttype varchar(100) not null,
actid varchar(150) not null,
activityvalue varchar(100) not null,
actvitiydesc varchar(100)
);

alter table aulog add constraint primary key (auid,actid,acttype);

insert into aulog (auid,acttype,actid,actvitiydesc,activityvalue) values (1,'create','1','create account','   ');

insert into aulog (auid,acttype,actid,actvitiydesc,activityvalue) values(2, 'create','2','create account','    ');
commit;
select * from aulog;
commit;
select * from rkmschool;
drop trigger testtriggerfist;

create  trigger testtriggerfist before insert on rkmschool
for each row 
begin
insert into aulog 
SET auid=new.rkmid,
actid=new.rkmschlname ,
acttype='insert',
activityvalue=new.rkmcity;
END;

select * from rkmschool;
insert into rkmschool values(4,'vibgyor school','wakad','pune');

select * from aulog;

commit;

select * from rkmstudent;

desc rkmstudent;
describe table rkmstudent;

insert into rkmstudent values ('2','rkm2','2017-12-01','sk','momin');

--drop trigger student_insert if exists;syntax error
drop trigger student_insert;
create trigger student_insert before insert on rkmstudent
for each row
begin
insert into aulog
SET auid=new.studentid,
actid=new.stdfname ,
acttype='insert new ',
activityvalue=new.stddateofbirth,
actvitiydesc=new.stdlname,
entname='rkmstudent',
actcolname='new record';
end;

insert into rkmstudent values ('5','ssk','1990-12-11','sk','momin');

select * from aulog;
alter table aulog add column actcolname varchar(100);
alter table aulog add column entname varchar(100);

--alter table aulog drop constraint primary key;syntax error
alter table aulog drop primary key; --correct syntax.
alter table aulog add auintid integer ;


create table studentJdbc (
studentid varchar(100),
studentname varchar(100),
studentlastname varchar(100),
studentmname varchar(100),
studentlname varchar(100),
studentdateofbirth varchar(100)
);
--corect syntax
alter table studentJdbc add primary key (studentid,studentname,studentmname,studentlname);



