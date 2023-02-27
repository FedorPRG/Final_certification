import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Delete {
    Print p = new Print();
    Counter c = new Counter();

    Scanner input = new Scanner(System.in);

    public String DeletePetsAnimals(ArrayList<PetsAnimals> ListPetsAnimals) {
        p.PrintPetsAnimals(ListPetsAnimals);
        System.out.println("Введите имя животного:");
        String nameDelete = input.nextLine();
        Iterator<PetsAnimals> PetsAnimalsIterator = ListPetsAnimals.iterator();
        while (PetsAnimalsIterator.hasNext()) {
            PetsAnimals nextPetsAnimals = PetsAnimalsIterator.next();
            if (nextPetsAnimals.getFirstName().equals(nameDelete)) {
                PetsAnimalsIterator.remove();
                c.sub();
                return "Животное с именен " + nameDelete + " удалено из реестра";
            }
        }
        return "Животное с именем " + nameDelete + " не найдено";
    }
}