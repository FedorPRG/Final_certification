import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    Print p = new Print();
    Scanner input = new Scanner(System.in);

    public boolean CheckOfClone(String FirstName, String NameOfAnimal,
            ArrayList<PetsAnimals> ListPetsAnimals) {
        for (PetsAnimals PetsAnimals : ListPetsAnimals) {
            if (PetsAnimals.getFirstName().equals(FirstName) 
                    && PetsAnimals.getNameOfAnimal().equals(NameOfAnimal)) {                        
                return false;
            }
        }
        return true;
    }

    public String SearchPetsAnimals(ArrayList<PetsAnimals> ListPetsAnimals) {
        p.PrintPetsAnimals(ListPetsAnimals);
        System.out.println("Введите имя животного:");
        String nameSearch = input.nextLine();
        for (PetsAnimals PetsAnimals : ListPetsAnimals) {
            if (PetsAnimals.getFirstName().equals(nameSearch)) {
                System.out.println("id Имя  Класс    дата рождения");
                return PetsAnimals.getFullName();
            }
        }
        return "Животное с именем " + nameSearch + " не найдено";
    }

    public String CommandsPetsAnimals(ArrayList<PetsAnimals> ListPetsAnimals) {
        p.PrintPetsAnimals(ListPetsAnimals);
        System.out.println("Введите имя животного:");
        String nameSearch = input.nextLine();
        for (PetsAnimals PetsAnimals : ListPetsAnimals) {
            if (PetsAnimals.getFirstName().equals(nameSearch)) {

                return PetsAnimals.getCommands();
            }
        }
        return "Животное с именем " + nameSearch + " не найдено";
    }

    public String AddCommandsPetsAnimals(ArrayList<PetsAnimals> ListPetsAnimals) {
        p.PrintPetsAnimals(ListPetsAnimals);
        System.out.println("Введите имя животного:");
        String nameSearch = input.nextLine();
        for (PetsAnimals PetsAnimals : ListPetsAnimals) {
            if (PetsAnimals.getFirstName().equals(nameSearch)) {
                System.out.printf("Введите дополнительные команды животного через пробел:");
                String AddCommands = input.nextLine();
                AddCommands = AddCommands.replaceAll("\\s+", ",");
                return PetsAnimals.setCommands(AddCommands);
            }
        }
        return "Животное с именем " + nameSearch + " не найдено";
    }

}
