select * from salesman;
select * from orders;

--Get all salesman ids without any repeated values
select distinct salesman_id from salesman;

--Display the order number ordered by date in ascending order
select order_no from orders Order By order_date ;

--Display the order number ordered by purchase amount in descending order
select order_no from orders order by purchase_amount desc;

--Display the full data of orders that have purchase amount less than 500.
select * from orders where purchase_amount<500;

--Display the full data of orders that have purchase amount between 1000 and 2000.
select * from orders where purchase_amount>1000 and purchase_amount<2000;