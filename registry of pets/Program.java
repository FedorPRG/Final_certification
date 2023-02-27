import java.util.ArrayList;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    // ArrayList<Dogs> ListDogs = new ArrayList<>();
    // ArrayList<Cats> ListCats = new ArrayList<>();
    // ArrayList<Hamsters> ListHamsters = new ArrayList<>();
    ArrayList<PetsAnimals> ListPetsAnimals = new ArrayList<>();

    Read r = new Read();
    Print p = new Print();
    Input i = new Input();
    Search s = new Search();
    Delete d = new Delete();
    System.out.print("\033[H\033[J");
    try (Scanner in = new Scanner(System.in)) {
      int contin = 0;
      while (contin == 0) {
        System.out.println();
        System.out.println("Реестр домашних животных");
        System.out.println("Введите номер команды");
        System.out.println("1 - чтение из файла");
        System.out.println("2 - вывод на экран");
        System.out.println("3 - добавление записи");
        System.out.println("4 - удаление записи");
        System.out.println("5 - поиск по имени");
        System.out.println("6 - список команд животного");
        System.out.println("7 - добавление команд животного");
        System.out.println("8 - запись в файл");
        System.out.println("9 - количество животных в реестре");
        System.out.println("10 - выход");
        String key = in.next();
        switch (key) {
          case "1":
            r.ReadPetsAnimals("PetsAnimalsSave.txt", ListPetsAnimals);
            break;
          case "2":
            p.PrintPetsAnimals(ListPetsAnimals);
            break;
          case "3":
            i.InputPetsAnimals(ListPetsAnimals);
            break;
          case "4":
            System.out.println(d.DeletePetsAnimals(ListPetsAnimals));
            p.PrintPetsAnimals(ListPetsAnimals);
            break;
          case "5":
            System.out.println(s.SearchPetsAnimals(ListPetsAnimals));
            break;
          case "6":
            System.out.println(s.CommandsPetsAnimals(ListPetsAnimals));
            break;
          case "7":
            System.out.println(s.AddCommandsPetsAnimals(ListPetsAnimals));
            break;
          case "8":
            Write.WritePetsAnimals("PetsAnimalsSave.txt", ListPetsAnimals);
            break;
          case "9":
            try (Counter c = new Counter()) {
              System.out.printf("Всего животных в реестре=%d", c.getCountToPrint());
            } catch (Exception ex) {
              // System.out.println(ex.getMessage());
            }
            break;
          case "10":
            contin = 1;
            break;
          default:
            System.out.println("Такой команды нет");
            break;
        }
      }
    }
  }
}
