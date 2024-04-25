
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


    
-- Problem 3 : Group data at the Sector level. Then find the average EPS for each sector and 
-- assign the alias AvgEPSPerSector. Sort the result by the AvgEPSPerSector column 
-- in descending order.

SELECT
	Sector, AVG(EPS) AS AvgEPSPerSector
FROM
	Stock
GROUP BY
	sector
Order BY
	AvgEPSPerSector DESC;



---------------------------------------------------------------------------------------------------------------

-- Problem 1 : Group data from the employee table at the department_id level and calculate the 
-- number of employees for each department. Assign the alias number_of_employees 
-- to this column. Sort the result in descending order by number_of_employees.

SELECT
	department_id, COUNT(*) AS number_of_employees
FROM
	employee
GROUP BY
	department_id
ORDER BY
	number_of_employees DESC;



-- Problem 2 : Group data from the employee table at the job_id level. Calculate the average 
-- salary for each position and assign the alias avg_salary. Sort the result by 
-- descending avg_salary.

SELECT
	job_id, AVG(salary)
FROM
	employee
GROUP BY
	job_id
ORDER BY
	AVG(salary) DESC;

---------------------------------------------------------------------------------------------------------------
