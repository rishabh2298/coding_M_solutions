
-- Link : https://www.notion.so/Group-By-Part-1-4beb346fafe54f22bac4b3c3e44362d9


-- Problem 1 : Group data at the Sector level. Then, calculate the number of 
-- companies for each sector and assign an alias NumOfStocks.

SELECT
	Sector, COUNT(*) AS NumberOfStocks
FROM
	Stock
GROUP BY
	sector;



-- Problem 2 : Group data at the Sector level. Then, calculate the number of companies for 
-- each sector and assign an alias NumOfStocks. Sort the result by the NumOfStocks 
-- column in descending order.

SELECT
	sector, COUNT(*) AS NumOfStocks
FROM
	Stock
GROUP BY
	sector
ORDER BY
	NumOfStocks DESC;
