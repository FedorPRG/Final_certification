
public abstract class PetsAnimals {
    protected Integer id;
    protected String FirstName;
    protected String NameOfAnimal;
    protected String Commands;

    public PetsAnimals(String name, String NameOfAnimal, String Commands) {

        this.FirstName = name;
        this.Commands = Commands;
        this.NameOfAnimal = NameOfAnimal;
        try (Counter c = new Counter();) {
            this.id = c.getCount();
            c.add();
        } catch (Exception ex) {
            // System.out.println(ex.getMessage());
        }

    }

    public String getFullName() {
        return String.format("%d  %-8s %-8s %s", id,
                FirstName, NameOfAnimal, Commands);
    }

    public String getFullNameForSave() {
        return String.format("%d %s %s %s", id,
                FirstName, NameOfAnimal, Commands);
    }

    public String getCommands() {
        return String.format("Команды животного: %s", Commands);
    }

    public String setCommands(String AddCommands) {
        if (Commands.equals("not_commands")) {
            Commands = AddCommands;
        } else {
            Commands = Commands + "," + AddCommands;
        }
        return String.format("Команды %s добавлены", AddCommands);
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getNameOfAnimal() {
        return NameOfAnimal;
    }

}
