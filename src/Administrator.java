public class Administrator extends Person{
    private int emptyTables;

    public Administrator(String name) {
        super(name);
        emptyTables = 0;
    }

    public boolean bookTable() {
        System.out.println("Администратор " + getName() + " бронирует столик");
        if (emptyTables == 0) {
            System.out.println("Все столы заняты");
            return false;
        }
        else {
            emptyTables--;
            return true;
        }
    }
    public void unbookTable() {
        System.out.println("Администратор " + getName() + " освобождает столик");
        emptyTables++;
    }
    public void addToMenu(Menu m, String title){
        System.out.println("Администратор " + getName() + " добавил пункт в меню");
        m.add(title);
    }

    public void removeFromMenu(Menu m, int index)
    {
        System.out.println("Администратор " + getName() + " удалил пункт из меню");
        m.remove(index);
    }

    public int getEmptyTables() { return emptyTables; }

    public void setEmptyTables(int cnt) { emptyTables = cnt; }
}
