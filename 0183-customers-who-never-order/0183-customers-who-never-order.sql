# Write your MySQL query statement below
select name as Customers
from Customers
left join Orders
on customers.id=orders.customerid where orders.customerid is null;