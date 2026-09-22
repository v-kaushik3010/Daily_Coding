-- Last updated: 9/22/2026, 2:57:19 PM
# Write your MySQL query statement below

SELECT e.name , b.bonus FROM Employee e
LEFT JOIN Bonus b ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS null;