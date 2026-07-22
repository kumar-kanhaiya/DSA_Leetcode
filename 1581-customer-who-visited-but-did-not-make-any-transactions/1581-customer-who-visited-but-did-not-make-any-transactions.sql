# Write your MySQL query statement below

select c.customer_id  , COUNT(c.customer_id) as count_no_trans  from Visits as c left join 
Transactions as t on c.visit_id = t.visit_id where t.transaction_id is null GROUP BY c.customer_id;