-- Last updated: 9/22/2026, 2:57:15 PM
# Write your MySQL query statement below
SELECT name FROM Customer
WHERE referee_id != 2 OR  referee_id IS null;