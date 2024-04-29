
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
    