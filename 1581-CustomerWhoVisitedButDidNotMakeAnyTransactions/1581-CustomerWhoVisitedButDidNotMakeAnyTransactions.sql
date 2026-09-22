-- Last updated: 9/22/2026, 2:51:38 PM
# Write your MySQL query statement below
SELECT v.customer_id , COUNT(v.customer_id)AS  count_no_trans FROM Visits v 
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.transaction_id is null
GROUP BY v.customer_id;
