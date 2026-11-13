# Write your MySQL query statement below
Select c.name AS customers from  customers c left join orders o on c.id=o.customerid where o.customerid IS NULL;
