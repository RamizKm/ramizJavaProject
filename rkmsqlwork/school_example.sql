--Oracle 11g Express Edition
-- Put your Oracle SQL statement here and execute it

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

drop table rkmstudent;

create table rkmstudent (
studentid varhar2(100) not null,
stdfname varchar2(100) not null,
stdmname varchar2(100),
stdlname varchar2(100),
stddateofbirth varchar2(100) not null
);


alter table rkmstudent add constraint primary key (studentid,stdfname,stddateofbirth);

insert into rkmstudent(studid,stdfname,stdmname) values ('rkm123','rkm fist','rkm first mname');

describe table rkmstudent;

drop table aulog;

create table aulog (
activitytype varchar2(100),
activitiyid varchar2(100),
activityvalue varchar2(100) 
);

alter table aulog add constraint primary key(activitytype,activitiyid,activityvalue);



