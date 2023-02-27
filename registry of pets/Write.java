import java.io.FileWriter;
import java.util.ArrayList;

public class Write {
  public static void WritePetsAnimals(String text, ArrayList<PetsAnimals> ListPetsAnimals) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (PetsAnimals PetsAnimals : ListPetsAnimals) {
      w.write(PetsAnimals.getFullNameForSave() + "\n");
    }
    w.flush();
    w.close();
  }
}
