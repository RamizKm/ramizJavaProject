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
rkmid number not null,
rkmschlname varchar2(100),
rkmschladdr varchar2(100),
rkmcity     varchar2(100)
);

alter table rkmschool add primary key (rkmid,rkmschlname);

insert into rkmschool(rkmid,rkmschlname) values (1,'rkmschool');

select * from rkmschool;

drop table rkmstudent;

create table rkmstudent (
studentid varchar2(100) not null,
stdfname varchar2(100) not null,
stddateofbirth varchar2(100) not null,
stdmname varchar2(100),
stdlname varchar2(100)

);


alter table rkmstudent add constraint primary key (studentid,stdfname,stddateofbirth);

insert into rkmstudent(studentid,stdfname,stddateofbirth) values ('rkm123','rkm fist','rkm first mname');

--desc rkmstudent;

drop table aulog;

create table aulog (
acttype varchar2(100) not null,
actid varchar2(150) not null,
activityvalue varchar2(100) not null,
actvitiydesc varchar2(100)
);

alter table aulog add constraint primary key (actid);



