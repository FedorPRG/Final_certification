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


