# Write your MySQL query statement below
SELECT 
    product_name,
    SUM(unit) as unit
FROM Products p
LEFT JOIN Orders o
ON p.product_id=o.product_id
AND o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY o.product_id, p.product_name
HAVING unit>=100;