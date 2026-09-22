-- Last updated: 9/22/2026, 2:52:35 PM
# Write your MySQL query st
SELECT e.unique_id, ep.name From EmployeeUNI e
RIGHT JOIN Employees ep on e.id = ep.id;