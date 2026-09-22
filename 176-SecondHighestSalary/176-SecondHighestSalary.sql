-- Last updated: 9/22/2026, 2:59:38 PM
# Write your MySQL query statement below
SELECT (SELECT DISTINCT salary  FROM employee
ORDER BY salary DESC 
LIMIT 1 OFFSET 1) AS SecondHighestSalary ;
