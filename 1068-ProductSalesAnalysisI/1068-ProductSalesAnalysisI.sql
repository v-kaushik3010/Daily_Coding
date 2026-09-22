-- Last updated: 9/22/2026, 2:54:20 PM
# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price FROM Sales s
JOIN Product p ON s.product_id = p.product_id;