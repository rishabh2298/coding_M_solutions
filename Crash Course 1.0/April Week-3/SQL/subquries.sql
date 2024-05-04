
-- Link : https://www.notion.so/Subqueries-bc1d459dff9b4092a1c4d8ea7e2d0191

-- Problem 1 : The following query is given:

-- SELECT
--   department_id
-- FROM
--   employee
-- WHERE
--   salary > 10000;

-- The query returns values for department_id for which salary is greater than 
-- 10000. Using the result of this query as a subquery, display the names of all 
-- departments for which the above condition is met.

SELECT
	department_name, department_id
FROM
	department
WHERE
	department_id IN (
    	SELECT
      		department_id
      	FROM
      		employee
      	WHERE
      		salary > 10000
    );



-- Problem 2 : Please follow the steps below.
-- 1. Create a query that returns the values for the job_id from the employee table 
-- where the salary is greater than 10,000.
-- 2. Using the result of the previous query as a subquery, display the names of 
-- all positions for which the above condition is met.
    
SELECT
	job_title, job_id
FROM
	job
WHERE
	job_id IN (
      SELECT
        job_id
      FROM
        job
      WHERE
        min_salary > 10000
    );



-----------------------------------------------------------------------------------------------------


-- Problem 3 : The following query is given:

-- SELECT
--   product_id,
--   COUNT(*) AS number_of_orders
-- FROM
--   sale
-- GROUP BY
--   product_id;

-- Modify this query to display only the first three values for the product_id 
-- with the highest value for the number_of_orders column.

SELECT
	product_id
FROM
	(
    SELECT
      product_id, COUNT(*) AS number_of_orders
    FROM
      sale
    GROUP BY
      product_id
    ORDER BY
      number_of_orders DESC
    )
LIMIT
	3 OFFSET 0;



-- Problem 4 : The following query is given:

-- SELECT
--   product_id
-- FROM
--   sale
-- GROUP BY
--   product_id
-- ORDER BY
--   COUNT(*) DESC
-- LIMIT
--   3;

-- Display all data from the product table about the products returned by the 
-- above query

SELECT
	*
FROM
	product
WHERE
 	product_id IN (
      SELECT
          product_id
      FROM
          sale
      GROUP BY
          product_id
      ORDER BY
          COUNT(*) DESC
      LIMIT
          3 OFFSET 0
    )