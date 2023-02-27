import java.util.ArrayList;

public class Print {
  public void PrintPetsAnimals(ArrayList<PetsAnimals> ListPetsAnimals) {
    System.out.println("id Имя      Класс    Команды");
    for (PetsAnimals PetsAnimals : ListPetsAnimals) {
      System.out.println(PetsAnimals.getFullName());
    }
  }
}
