
-- Link : https://www.notion.so/Aggregate-Functions-c97f61060aaf4f929a9e840e2e21bf72

-- Problem 1 : Create a query that displays the number of records in the Stock table.

SELECT
	COUNT(*)
FROM
 	Stock;


-- Problem 2 :Create a query that displays the number of non-empty values in the EPS column. 
-- Assign the alias NonMissingEPS to the result.

SELECT
	COUNT(EPS) as NonMissingEPS
FROM
	Stock
WHERE
	EPS NotNULL;
