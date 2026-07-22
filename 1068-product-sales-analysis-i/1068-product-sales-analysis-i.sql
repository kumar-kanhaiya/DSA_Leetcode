# Write your MySQL query statement below
SELECT P.product_name  , S.year , S.price FROM Product as P inner join 
Sales as S on S.product_id   = P.product_id;