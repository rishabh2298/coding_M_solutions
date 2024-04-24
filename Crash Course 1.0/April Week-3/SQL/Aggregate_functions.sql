
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



-- Problem 3 :Create a query that displays the number of NULL values in the EPS column. 
-- Assign the alias MissingEPS to the result.

SELECT
	(COUNT(*) - COUNT(EPS)) AS MissingEPS
FROM
	Stock



-- Problem 4 : Create a query that displays the number of unique values for the Sector column 
-- and assign an alias NumberOfSectors to the result.

SELECT
	COUNT(DISTINCT sector) AS NumberOfSectors
FROM
	Stock;



-- Problem 5 : Create a query that displays the average value for the Price column. Assign 
-- the alias AvgPrice to the result.

SELECT
	ROUND(AVG(price),2) AS AvgPrice
FROM
	Stock;



-- Problem 6 : Create a query that displays the lowest and highest values for EPS in the 
-- table. Assign the MinEPS and MaxEPS aliases respectively.

SELECT
	MIN(EPS) AS MinEPS, MAX(EPS) AS MaxEPS
FROM
	Stock;



-- Problem 7 : Create a query that displays the following columns from the Stock table:
-- * Id
-- * Ticker
-- * FullName
-- Also add a fourth column to the result that is the number of characters in the 
-- Ticker. Assign the alias TickerLength to the fourth column.

SELECT
	Id, Ticker, Fullname, LENGTH(ticker) AS TickerLength
FROM
	Stock
