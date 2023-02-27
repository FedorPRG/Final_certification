import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
  Print p = new Print();
  Search s = new Search();

  public void ReadPetsAnimals(String text, ArrayList<PetsAnimals> ListPetsAnimals) throws Exception {
    FileReader r = new FileReader(text);
    Scanner scan = new Scanner(r);
    while (scan.hasNextLine()) {
      String[] Data = scan.nextLine().split(" ");

      // int id = Integer.parseInt(Data[0]);
      String FirstName = Data[1];
      String NameOfAnimal = Data[2];
      String Commands = Data[3];

      if (s.CheckOfClone(FirstName, NameOfAnimal, ListPetsAnimals)) {
        if (NameOfAnimal.equals("Dogs")) {
          ListPetsAnimals.add(new Dogs(FirstName, Commands));
        }
        if (NameOfAnimal.equals("Cats")) {
          ListPetsAnimals.add(new Cats(FirstName, Commands));
        }
        if (NameOfAnimal.equals("Hamsters")) {
          ListPetsAnimals.add(new Hamsters(FirstName, Commands));
        }
      }
    }
    scan.close();
    r.close();
    p.PrintPetsAnimals(ListPetsAnimals);
  }
}
