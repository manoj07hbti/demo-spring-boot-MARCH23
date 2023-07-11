create table demo_student_march(
   name varchar2(40),
   age  number,
   dept varchar2(20)

);


INSERT INTO STUDENT_MARCH (name,roll_no,section) values('Rahul',4,'CS')

INSERT INTO STUDENT_MARCH (name,roll_no,section) values('Mohit',2,'IT')

INSERT INTO STUDENT_MARCH (name,roll_no,section) values('Jatin',3,'IT')

INSERT INTO STUDENT_MARCH (name,roll_no,section) values('Mukesh',5,'CS')

select * from STUDENT_MARCH

select name, section from STUDENT_MARCH

select name from STUDENT_MARCH

select * from STUDENT_MARCH  where section='CS'

select * from STUDENT_MARCH  where section='IT'

select * from STUDENT_MARCH  where section='CS' and roll_no=1