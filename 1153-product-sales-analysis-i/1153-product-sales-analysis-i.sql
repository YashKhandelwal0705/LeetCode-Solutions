# Write your MySQL query statement below
SELECT product_name, year , price
FROM SALES s
JOIN Product p
ON s.product_id = p.product_id;