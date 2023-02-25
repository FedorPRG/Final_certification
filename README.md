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