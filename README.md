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

mysql> INSERT INTO `Animals` (`id`,`Type of animal`)
    -> VALUES
    -> ('1','Pets'),
    -> ('2','Packs');

mysql> CREATE TABLE Dogs (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Dogs` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('1','Bim','stand','2019-01-25'),
    ->     ('1','Bom','sit','2020-01-25'),
    ->     ('1','Bam','voice','2023-01-25');

mysql> CREATE TABLE Cats (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Cats` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('1','Tim','stand','2019-01-25'),
    ->     ('1','Tom','sit','2020-01-25'),
    ->     ('1','Tam','voice','2023-01-25');

mysql> CREATE TABLE `Hamsters` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Hamsters` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('1','Sim','stand','2019-01-25'),
    ->     ('1','Som','sit','2020-01-25'),
    ->     ('1','Sam','voice','2023-01-25');

mysql> CREATE TABLE Horses (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Horses` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('2','Kim','stand','2019-01-25'),
    ->     ('2','Kom','go','2020-01-25'),
    ->     ('2','Kam','run','2023-01-25');

mysql> CREATE TABLE `Camels` (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Camels` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('2','Dim','stand','2019-01-25'),
    ->     ('2','Dom','go','2020-01-25'),
    ->     ('2','Dam','run','2023-01-25');

mysql> CREATE TABLE Donkeys (`id` INT, `Name` VARCHAR(50), `Commands` VARCHAR(50), `birthday` DATE, FOREIGN KEY (id) REFERENCES Animals (id));

mysql> INSERT INTO `Donkeys` (`id`,`Name`,`Commands`,`birthday`)
    ->     VALUES
    ->     ('2','Rim','stand','2019-01-25'),
    ->     ('2','Rom','go','2020-01-25'),
    ->     ('2','Ram','run','2023-01-25');

mysql> SELECT * FROM Animals;
+----+----------------+
| id | Type of animal |
+----+----------------+
|  1 | Pets           |
|  2 | Packs          |
+----+----------------+

mysql> SELECT * FROM Dogs;
+------+------+----------+------------+
| id   | Name | Commands | birthday   |
+------+------+----------+------------+
|    1 | Bim  | stand    | 2019-01-25 |
|    1 | Bom  | sit      | 2020-01-25 |
|    1 | Bam  | voice    | 2023-01-25 |
+------+------+----------+------------+

mysql> SELECT * FROM Cats;
+------+------+----------+------------+
| id   | Name | Commands | birthday   |
+------+------+----------+------------+
|    1 | Tim  | stand    | 2019-01-25 |
|    1 | Tom  | sit      | 2020-01-25 |
|    1 | Tam  | voice    | 2023-01-25 |
+------+------+----------+------------+

mysql> SELECT * FROM Hamsters;
+------+------+----------+------------+
| id   | Name | Commands | birthday   |
+------+------+----------+------------+
|    1 | Sim  | stand    | 2019-01-25 |
|    1 | Som  | sit      | 2020-01-25 |
|    1 | Sam  | voice    | 2023-01-25 |
+------+------+----------+------------+

mysql> SELECT * FROM Horses;
+------+------+----------+------------+
| id   | Name | Commands | birthday   |
+------+------+----------+------------+
|    2 | Kim  | stand    | 2019-01-25 |
|    2 | Kom  | go       | 2020-01-25 |
|    2 | Kam  | run      | 2023-01-25 |
+------+------+----------+------------+

mysql> SELECT * FROM Camels;
+------+------+----------+------------+
| id   | Name | Commands | birthday   |
+------+------+----------+------------+
|    2 | Dim  | stand    | 2019-01-25 |
|    2 | Dom  | go       | 2020-01-25 |
|    2 | Dam  | run      | 2023-01-25 |
+------+------+----------+------------+

mysql> SELECT * FROM Donkeys;
+------+------+----------+------------+
| id   | Name | Commands | birthday   |
+------+------+----------+------------+
|    2 | Rim  | stand    | 2019-01-25 |
|    2 | Rom  | go       | 2020-01-25 |
|    2 | Ram  | run      | 2023-01-25 |
+------+------+----------+------------+




