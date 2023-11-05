# Write your MySQL query statement below
SELECT unique_id,name FROM Employees e LEFT JOIN EmployeeUNI ei ON e.id=ei.id