# Final_certification

## Задание №1

fed@Ubuntu23:~/Final_certification$ cat > Pets
собаки, кошки, хомяки

fed@Ubuntu23:~/Final_certification$ cat > Pack_animals
лошади, верблюды, ослы

fed@Ubuntu23:~/Final_certification$ cat Pets  Pack_animals > merge_file

fed@Ubuntu23:~/Final_certification$ cat merge_file
собаки, кошки, хомяки
лошади, верблюды, ослы

fed@Ubuntu23:~/Final_certification$ mv merge_file human_friends

## Задание №2

fed@Ubuntu23:~/Final_certification$ mkdir direct

fed@Ubuntu23:~/Final_certification$ mv human_friends ./direct/

fed@Ubuntu23:~/Final_certification$ cd direct/

fed@Ubuntu23:~/Final_certification/direct$ ls

human_friends

## Задание №3

fed@Ubuntu23:~/Final_certification/direct$ sudo apt update

fed@Ubuntu23:~/Final_certification/direct$ sudo apt list mysql-server mysql-client

fed@Ubuntu23:~/Final_certification$ sudo apt-get install mysql-server

fed@Ubuntu23:~/Final_certification$ sudo apt-get install mysql-client

## Задание №4

fed@Ubuntu23:~/Final_certification$ sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb

fed@Ubuntu23:~/Final_certification$ sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb

fed@Ubuntu23:~/Final_certification$ sudo dpkg --purge  mysql-apt-config mysql-client-8.0  mysql-client-core-8.0  mysql-common  mysql-server-8.0  mysql-server-core-8.0

## Задание №5

Выполнено

## Задание №6

Выполнено

## Задание №7

fed@Ubuntu23:~$ sudo mysql -u root -p

mysql> CREATE DATABASE Human_friends;
Query OK, 1 row affected (0,02 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| Human_friends      |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0,00 sec)
mysql> USE Human_friends;

## Задание №8, 9

mysql> CREATE TABLE `Animals` (`id` INT PRIMARY KEY, `Type of animal` VARCHAR(50));

mysql> INSERT INTO `Animals` (`id`,`Type of animal`)
    -> VALUES
    -> ('1','Pets'),
    -> ('2','Packs');

mysql> SELECT * FROM `Animals`;
+----+----------------+
| id | Type of animal |
+----+----------------+
|  1 | Pets           |
|  2 | Packs          |
+----+----------------+

mysql> CREATE TABLE `Dogs` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Dogs` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('1','Dogsim','stand','2019-01-25'),
    ->     ('1','Dogsom','sit','2021-01-25'),
    ->     ('1','Dogsam','voice','2023-01-25');

mysql> SELECT * FROM `Dogs`;
+------+--------+----------+------------+
| id   | Name   | Commands | birthday   |
+------+--------+----------+------------+
|    1 | Dogsim | stand    | 2019-01-25 |
|    1 | Dogsom | sit      | 2021-01-25 |
|    1 | Dogsam | voice    | 2023-01-25 |
+------+--------+----------+------------+

mysql> CREATE TABLE `Cats` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Cats` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('1','Catsim','stand','2019-01-25'),
    ->     ('1','Catsom','sit','2021-01-25'),
    ->     ('1','Catsam','voice','2023-01-25');

mysql> SELECT * FROM `Cats`;
+------+--------+----------+------------+
| id   | Name   | Commands | birthday   |
+------+--------+----------+------------+
|    1 | Catsim | stand    | 2019-01-25 |
|    1 | Catsom | sit      | 2021-01-25 |
|    1 | Catsam | voice    | 2023-01-25 |
+------+--------+----------+------------+

mysql> CREATE TABLE `Hamsters` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Hamsters` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('1','Hamstersim','stand','2019-01-25'),
    ->     ('1','Hamstersom','sit','2021-01-25'),
    ->     ('1','Hamstersam','voice','2023-01-25');

mysql> SELECT * FROM `Hamsters`;
+------+------------+----------+------------+
| id   | Name       | Commands | birthday   |
+------+------------+----------+------------+
|    1 | Hamstersim | stand    | 2019-01-25 |
|    1 | Hamstersom | sit      | 2021-01-25 |
|    1 | Hamstersam | voice    | 2023-01-25 |
+------+------------+----------+------------+

mysql> CREATE TABLE `Horses` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));


mysql> INSERT INTO `Horses` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('2','Horsesim','stand','2019-01-25'),
    ->     ('2','Horsesom','go','2021-01-25'),
    ->     ('2','Horsesam','run','2023-01-25');

mysql> SELECT * FROM `Horses`;
+------+----------+----------+------------+
| id   | Name     | Commands | birthday   |
+------+----------+----------+------------+
|    2 | Horsesim | stand    | 2019-01-25 |
|    2 | Horsesom | go       | 2021-01-25 |
|    2 | Horsesam | run      | 2023-01-25 |
+------+----------+----------+------------+

mysql> CREATE TABLE `Camels` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Camels` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('2','Cim','stand','2019-01-25'),
    ->     ('2','Com','go','2021-01-25'),
    ->     ('2','Cam','run','2023-01-25');

mysql> SELECT * FROM `Camels`;
+------+------+----------+------------+
| id   | Name | Commands | birthday   |
+------+------+----------+------------+
|    2 | Cim  | stand    | 2019-01-25 |
|    2 | Com  | go       | 2021-01-25 |
|    2 | Cam  | run      | 2023-01-25 |
+------+------+----------+------------+

mysql> CREATE TABLE `Donkeys` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Donkeys` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('2','Donkeysim','stand','2019-01-25'),
    ->     ('2','Donkeysom','go','2021-01-25'),
    ->     ('2','Donkeysam','run','2023-01-25');

mysql> SELECT * FROM `Donkeys`;
+------+-----------+----------+------------+
| id   | Name      | Commands | birthday   |
+------+-----------+----------+------------+
|    2 | Donkeysim | stand    | 2019-01-25 |
|    2 | Donkeysom | go       | 2021-01-25 |
|    2 | Donkeysam | run      | 2023-01-25 |
+------+-----------+----------+------------+

## Задание №10

mysql> DROP TABLE `Camels`;

mysql> SELECT * FROM `Camels`;
ERROR 1146 (42S02): Table 'Human_friends.Camels' doesn't exist

mysql> CREATE TABLE `Horses_Donkeys` SELECT * FROM `Horses`
    -> UNION ALL SELECT * FROM `Donkeys`;

mysql> select * from  `Horses_Donkeys`;
+------+-----------+----------+------------+
| id   | Name      | Commands | birthday   |
+------+-----------+----------+------------+
|    2 | Horsesim  | stand    | 2019-01-25 |
|    2 | Horsesom  | go       | 2021-01-25 |
|    2 | Horsesam  | run      | 2023-01-25 |
|    2 | Donkeysim | stand    | 2019-01-25 |
|    2 | Donkeysom | go       | 2021-01-25 |
|    2 | Donkeysam | run      | 2023-01-25 |
+------+-----------+----------+------------+

## Задание №11

mysql> CREATE TABLE `Young_Animals SELECT` * FROM `Dogs`
    -> WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW()
    -> UNION ALL SELECT * FROM `Cats`
    -> WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW()
    -> UNION ALL SELECT * FROM `Hamsters`
    -> WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW()
    -> UNION ALL SELECT * FROM `Horses_Donkeys`
    -> WHERE birthday + INTERVAL 1 YEAR < NOW() and birthday + INTERVAL 3 YEAR > NOW();

mysql> select * from `Young_Animals`;
+------+------------+----------+------------+
| id   | Name       | Commands | birthday   |
+------+------------+----------+------------+
|    1 | Dogsom     | sit      | 2021-01-25 |
|    1 | Catsom     | sit      | 2021-01-25 |
|    1 | Hamstersom | sit      | 2021-01-25 |
|    2 | Horsesom   | go       | 2021-01-25 |
|    2 | Donkeysom  | go       | 2021-01-25 |
+------+------------+----------+------------+

mysql> ALTER TABLE `Young_Animals` ADD COLUMN `age (month)` int;

mysql> UPDATE `Young_Animals`

    -> SET `age (month)` = timestampdiff(month, birthday, now());

mysql> select * from `Young_Animals`;
+------+------------+----------+------------+-------------+
| id   | Name       | Commands | birthday   | age (month) |
+------+------------+----------+------------+-------------+
|    1 | Dogsom     | sit      | 2021-01-25 |          25 |
|    1 | Catsom     | sit      | 2021-01-25 |          25 |
|    1 | Hamstersom | sit      | 2021-01-25 |          25 |
|    2 | Horsesom   | go       | 2021-01-25 |          25 |
|    2 | Donkeysom  | go       | 2021-01-25 |          25 |
+------+------------+----------+------------+-------------+

mysql> CREATE TABLE `All Animals` SELECT * FROM `Dogs`
    -> UNION ALL SELECT * FROM `Cats`
    -> UNION ALL SELECT * FROM `Hamsters`
    -> UNION ALL SELECT * FROM `Horses_Donkeys`;

mysql> select * from `All Animals`;
+------+------------+----------+------------+
| id   | Name       | Commands | birthday   |
+------+------------+----------+------------+
|    1 | Dogsim     | stand    | 2019-01-25 |
|    1 | Dogsom     | sit      | 2021-01-25 |
|    1 | Dogsam     | voice    | 2023-01-25 |
|    1 | Catsim     | stand    | 2019-01-25 |
|    1 | Catsom     | sit      | 2021-01-25 |
|    1 | Catsam     | voice    | 2023-01-25 |
|    1 | Hamstersim | stand    | 2019-01-25 |
|    1 | Hamstersom | sit      | 2021-01-25 |
|    1 | Hamstersam | voice    | 2023-01-25 |
|    2 | Horsesim   | stand    | 2019-01-25 |
|    2 | Horsesom   | go       | 2021-01-25 |
|    2 | Horsesam   | run      | 2023-01-25 |
|    2 | Donkeysim  | stand    | 2019-01-25 |
|    2 | Donkeysom  | go       | 2021-01-25 |
|    2 | Donkeysam  | run      | 2023-01-25 |
+------+------------+----------+------------+