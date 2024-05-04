
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
