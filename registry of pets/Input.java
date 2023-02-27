import java.util.ArrayList;
import java.util.Scanner;

public class Input {
  Print p = new Print();
  Scanner input = new Scanner(System.in);

  public void InputPetsAnimals(ArrayList<PetsAnimals> ListPetsAnimals) {

    while (true) {
      System.out.printf("Введите количество дополнительныйх записей (можно 0):");
      if (input.hasNextInt()) {
        int amount = input.nextInt();
        for (int i = 0; i < amount; i++) {
          input.nextLine();
          System.out.printf("Введите имя:");
          String FirstName = input.nextLine();
          System.out.printf("Введите команды животного через пробел:");
          String Commands = input.nextLine();
          if (Commands.isEmpty()) {
            Commands="not_commands";
          }
          Commands=Commands.replaceAll("\\s+", ",");
          if (Commands.equals(",")) {
            Commands="not_commands";
          }                    
          if (String.valueOf(Commands.charAt(0)).equals(",")) {
            Commands=Commands.substring(1);
          }
          if (String.valueOf(Commands.charAt(Commands.length()-1)).equals(",")) {
            Commands=Commands.substring(0,Commands.length()-1);
          }
          
          while (true) {
            System.out.printf("Введите класс животного (сабаки - 1, кошки - 2, хомяки - 3):");
            if (input.hasNextInt()) {
              int IntNameOfAnimal = input.nextInt();
              if (IntNameOfAnimal == 1) {
                ListPetsAnimals.add(new Dogs(FirstName, Commands));
                break;
              }
              if (IntNameOfAnimal == 2) {
                ListPetsAnimals.add(new Cats(FirstName, Commands));
                break;
              }
              if (IntNameOfAnimal == 3) {
                ListPetsAnimals.add(new Hamsters(FirstName, Commands));
                break;
              } else {
                System.out.println("Вы ввели не правильный номер класса. Попробуйте еще раз.");
              }
            } else {
              System.out.println("Вы ввели не число. Попробуйте еще раз.");
              var c = input.nextLine();
            }
          }
          p.PrintPetsAnimals(ListPetsAnimals);
        }break;
      } else {
        System.out.println("Вы ввели не число. Попробуйте еще раз.");
        var c = input.nextLine();
      }
    }
  }
}