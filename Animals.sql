DROP TABLE IF EXISTS `All Animals`;
DROP TABLE IF EXISTS Young_Animals;
DROP TABLE IF EXISTS Horses_Donkeys;
DROP TABLE IF EXISTS Donkeys;
DROP TABLE IF EXISTS Camels;
DROP TABLE IF EXISTS Horses;
DROP TABLE IF EXISTS Hamsters;
DROP TABLE IF EXISTS Cats;
DROP TABLE IF EXISTS Dogs;
DROP TABLE IF EXISTS Animals;
CREATE TABLE Animals (id INT PRIMARY KEY, `Type of animal` VARCHAR(50));
INSERT INTO `Animals` (`id`,`Type of animal`)
    VALUES
    ('1','Pets'),
    ('2','Packs');

SELECT * FROM Animals;

DROP TABLE IF EXISTS Dogs;
CREATE TABLE Dogs (id INT, `Name` VARCHAR(50), Commands VARCHAR(50), birthday DATE, FOREIGN KEY (id) REFERENCES Animals (id));
INSERT INTO `Dogs` (`id`,`Name`,`Commands`,`birthday`)
    VALUES
    ('1','Dogsim','stand','2019-01-25'),
    ('1','Dogsom','sit','2021-01-25'),
    ('1','Dogsam','voice','2023-01-25');
SELECT * FROM Dogs;

DROP TABLE IF EXISTS Cats;
CREATE TABLE Cats (id INT, `Name` VARCHAR(50), Commands VARCHAR(50), birthday DATE, FOREIGN KEY (id) REFERENCES Animals (id));
INSERT INTO `Cats` (`id`,`Name`,`Commands`,`birthday`)
    VALUES
    ('1','Catsim','stand','2019-01-25'),
    ('1','Catsom','sit','2021-01-25'),
    ('1','Catsam','voice','2023-01-25');
SELECT * FROM Cats;

DROP TABLE IF EXISTS Hamsters;
CREATE TABLE Hamsters (id INT, `Name` VARCHAR(50), Commands VARCHAR(50), birthday DATE, FOREIGN KEY (id) REFERENCES Animals (id));
INSERT INTO `Hamsters` (`id`,`Name`,`Commands`,`birthday`)
    VALUES
    ('1','Hamstersim','stand','2019-01-25'),
    ('1','Hamstersom','sit','2021-01-25'),
    ('1','Hamstersam','voice','2023-01-25');
SELECT * FROM Hamsters;

DROP TABLE IF EXISTS Horses;
CREATE TABLE Horses (id INT, `Name` VARCHAR(50), Commands VARCHAR(50), birthday DATE, FOREIGN KEY (id) REFERENCES Animals (id));
INSERT INTO `Horses` (`id`,`Name`,`Commands`,`birthday`)
    VALUES
    ('2','Horsesim','stand','2019-01-25'),
    ('2','Horsesom','go','2021-01-25'),
    ('2','Horsesam','run','2023-01-25');
SELECT * FROM Horses;

DROP TABLE IF EXISTS Camels;
CREATE TABLE Camels (id INT, `Name` VARCHAR(50), Commands VARCHAR(50), birthday DATE, FOREIGN KEY (id) REFERENCES Animals (id));
INSERT INTO `Camels` (`id`,`Name`,`Commands`,`birthday`)
    VALUES
    ('2','Cim','stand','2019-01-25'),
    ('2','Com','go','2021-01-25'),
    ('2','Cam','run','2023-01-25');
SELECT * FROM Camels;

DROP TABLE IF EXISTS Donkeys;
CREATE TABLE Donkeys (id INT, `Name` VARCHAR(50), Commands VARCHAR(50), birthday DATE, FOREIGN KEY (id) REFERENCES Animals (id));
INSERT INTO `Donkeys` (`id`,`Name`,`Commands`,`birthday`)
    VALUES
    ('2','Donkeysim','stand','2019-01-25'),
    ('2','Donkeysom','go','2021-01-25'),
    ('2','Donkeysam','run','2023-01-25');
SELECT * FROM Donkeys;

DROP TABLE Camels;
-- SELECT * FROM Camels;

DROP TABLE IF EXISTS Horses_Donkeys;
CREATE TABLE Horses_Donkeys SELECT * FROM Horses
UNION ALL SELECT * FROM Donkeys;

select * from  Horses_Donkeys;

DROP TABLE IF EXISTS Young_Animals;
CREATE TABLE Young_Animals SELECT * FROM Dogs
WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW()
UNION ALL SELECT * FROM Cats
WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW()
UNION ALL SELECT * FROM Hamsters
WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW()
UNION ALL SELECT * FROM Horses_Donkeys
WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW();

select * from Young_Animals;

ALTER TABLE Young_Animals ADD COLUMN `age (month)` int;
UPDATE Young_Animals
SET `age (month)` = timestampdiff(month, birthday, now());

select * from Young_Animals;

DROP TABLE IF EXISTS `All Animals`;
CREATE TABLE `All Animals` SELECT * FROM Dogs
UNION ALL SELECT * FROM Cats
UNION ALL SELECT * FROM Hamsters
UNION ALL SELECT * FROM Horses_Donkeys;

select * from `All Animals`;
