create table Employee_Table(
   Name varchar2(40),
   Employee_ID  number,
   City varchar2(20)

);

INSERT INTO Employee_Table (Name,Employee_ID,City) Values('Akhil',20,'Agra')/

Select* from Employee_Table

select* from Employee_Table where City='Agra'

select Name,City from Employee_Table

select* from Employee_Table where City='Delhi'