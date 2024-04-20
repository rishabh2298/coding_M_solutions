
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
