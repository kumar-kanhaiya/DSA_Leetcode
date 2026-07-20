# Write your MySQL query statement below
-- select u.unique_id , e.name from EmployeeUNI as u left JOIN Employees as e 
-- on u.id = e.id;
select unique_id, name from Employees e
LEFT JOIN EmployeeUNI o ON e.id = o.id;