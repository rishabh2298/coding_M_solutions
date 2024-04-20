
-- LIMIT OFFSET

-- DROP TABLE IF EXISTS Stock;

-- CREATE TABLE Stock (
-- 	Id         INTEGER PRIMARY KEY,
-- 	Ticker     TEXT    NOT NULL,
-- 	FullName   TEXT    NOT NULL,
-- 	TradingDay TEXT    NOT NULL,
-- 	Price      REAL    NOT NULL CHECK (Price > 0),
-- 	Sector     TEXT    NOT NULL,
-- 	EPS        REAL
-- );


-- Problem 1 : Create a query that displays the first 5 records from the Stock table.

SELECT
   *
FROM
   Stock
LIMIT 5 OFFSET 0;



-- Problem 2 : Create a query that displays 5 records from the Stock table that 
-- have the highest price (the Price column). Sort the result in descending order 
-- by the Price column.

SELECT
   *
FROM
   Stock
ORDER BY
   Price DESC
LIMIT 5 OFFSET 0;



-- Problem 3 : Create a query that displays the first three records in the Stock 
-- table that have the highest EPS (earnings per share) value. Sort the result in 
-- descending order by the EPS column.

SELECT
   	*
FROM
	Stock
ORDER BY
	EPS DESC
LIMIT 3 OFFSET 0;



-- Problem 4 : Create a query that displays the following columns from the Stock

SELECT
	Sector,
    fullname,
    Price
FROM
	Stock
ORDER BY
	Sector DESC
LIMIT 5 OFFSET 0;



-- Problem 5 : Create a query that skips the first three records of the Stock 
-- table and displays the next five records.

SELECT
	*
FROM
	Stock
LIMIT 5 OFFSET 3;



-- Problem 6 : Create a query that displays the following columns from the Stock 
-- table:
-- * Ticker
-- * Price
-- * EPS
-- Sort the result by the EPS column in descending order. Then skip the first 
-- three records and display the next five records.

SELECT
	ticker
    price
    eps
FROM
	Stock
ORDER BY
	EPS DESC
LIMIT 
	5 OFFSET 3;



-- Problem 7 : Create a query that displays the third company with the highest EPS 
-- from the Stock table. Use the LIMIT and OFFSET clauses for this exercise.

SELECT
	*
FROM
	Stock
ORDER BY
	EPS DESC
LIMIT
	1 OFFSET 2;



-- Problem 8 : Create a query that displays the second company with the lowest Price
--  from the Stock table. Use the LIMIT and OFFSET clauses for this exercise.

SELECT
 	*
FROM
	Stock
ORDER BY
	price ASC
LIMIT
	1 OFFSET 1



-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=


-- Problem 1 : Create a query that displays the first ten rows from the job table.

SELECT
	*
FROM
	job
LIMIT
	10 OFFSET 0;



-- Problem 2 : Create a query that displays the top five highest paying positions 
-- (take into account the max_salary column)

SELECT
	*
FROM
	job
ORDER BY
	max_salary DESC
LIMIT
	5 OFFSET 0;



-- Problem 3 : Create a query that displays the top five highest paying positions. 
-- Take the mean value of the columns into account:
-- * min_salary
-- * max_salary
-- To do this, create a new column called avg_salary that will contain the average 
-- value of the above-mentioned columns. In the result table, display all columns 
-- of the job table including the avg_salary column (as the last column).

SELECT
	*, (max_salary + min_salary)/2 AS avg_salary
FROM
	job
ORDER BY
	max_salary DESC
LIMIT
	5 OFFSET 0;



-- Problem 4 : The following query is given:
-- SELECT
--   *,
--   (min_salary + max_salary) / 2.0 AS avg_salary
-- FROM
--   job;
-- Convert the given query to display all the data for the fourth highest paying 
-- job in terms of avg_salary value.

SELECT
	*, (max_salary + min_salary)/2 AS avg_salary
FROM
	job
ORDER BY
	max_salary DESC
LIMIT
	1 OFFSET 3;
    