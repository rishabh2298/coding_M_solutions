
-- Link : https://www.notion.so/Group-By-Having-Part-2-3057b3e9dae1412082fa0651c49187e8

-- GroupBy part-2


-- Problem 1 : Group data at the Sector level. Then find the average EPS for each sector and 
-- assign the alias AvgEPSPerSector. Display sectors with AvgEPSPerSector above 10 
-- and sort the result by the AvgEPSPerSector column in descending order.

SELECT
	Sector, AVG(EPS) AS AvgEPSPerSector
FROM
	Stock
GROUP BY
	sector
HAVING
	AvgEPSPerSector > 10
Order BY
	AvgEPSPerSector DESC;



-- Problem 2 : The following query is given:

-- SELECT
--   job_id,
--   AVG(salary) AS avg_salary
-- FROM
--   employee
-- GROUP BY
--   job_id
-- ORDER BY
--   avg_salary DESC;

-- Modify this query to display those job_id values for which the average salary 
-- is greater than 10,000.

SELECT
  job_id,
  AVG(salary) AS avg_salary
FROM
  employee
GROUP BY
  job_id
HAVING
  avg_salary > 10000
ORDER BY
  avg_salary DESC;



-- Problem 3 : The following query is given:

-- SELECT
--   job_id,
--   AVG(salary) AS avg_salary
-- FROM
--   employee
-- GROUP BY
--   job_id
-- ORDER BY
--   avg_salary DESC;

-- Modify this query to display those job_id values for which the average salary 
-- is in the range [10,000, 20,000].

SELECT
  job_id,
  AVG(salary) AS avg_salary
FROM
  employee
GROUP BY
  job_id
HAVING
  avg_salary BETWEEN 10000 AND 20000
ORDER BY
  avg_salary DESC;



-- Problem 4 : Group the data in the sale table at product_id level. Calculate the number of 
-- orders for each product and assign it to a column named number_of_orders. Then,
--  using the HAVING clause, extract products with a number of orders greater than
--  one. Sort the result in descending order by number_of_orders.

SELECT
	product_id, COUNT(*) AS number_of_orders
FROM
	sale
GROUP BY
	product_id
HAVING
	number_of_orders > 1
ORDER BY
	number_of_orders DESC;
    