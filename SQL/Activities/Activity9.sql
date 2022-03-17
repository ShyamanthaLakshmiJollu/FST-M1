create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);
    -- Insert values into it
insert all
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values(3007, 'Brad Davis', 'New York', 200, 5001)
into customers values(3005, 'Graham Zusi', 'California', 200, 5002) 
into customers values(3008, 'Julian Green', 'London', 300, 5002)
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
into customers values(3001, 'Brad Guzan', 'London', 300, 5005)

select 1 from dual;

select * from customers
select * from salesman
--Write an SQL statement to know which salesman are working for which customer.
select * from customers c join salesman s
on c.salesman_id=s.salesman_id

--Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.

select c.customer_id,c.customer_name,c.grade,c.salesman_id,c.city from customers c left outer join salesman s
on  c.salesman_id=s.salesman_id where c.grade<300 order by c.customer_id;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT c.customer_name AS "CustomerName", c.city, s.salesman_name AS "Salesman", s.commission FROM customers c 
INNER JOIN salesman s ON c.salesman_id=s.salesman_id 
WHERE s.commission>12;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;
