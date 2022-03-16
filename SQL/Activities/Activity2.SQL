INSERT INTO salesman VALUES(5001, 'James Hoog', 'New york', 15);

-- Insert multiple rows at once
INSERT ALL
    INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;