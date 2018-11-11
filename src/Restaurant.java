import java.util.Random;

public class Restaurant {
    private Administrator admin;
    private Menu menu;
    private int tablesCnt;
    private Waiter[] waiters;

    public Restaurant(Administrator a, Waiter[] waiters, int tablesCnt){
        admin = a;
        a.setEmptyTables(tablesCnt);
        this.tablesCnt = tablesCnt;
        this.waiters = waiters;
        menu = new Menu();
    }

    public Administrator getAdmin(){
        return admin;
    }

    public Waiter getWaiter(){
        Random r = new Random();
        return waiters[r.nextInt(waiters.length)];
    }

    public Menu getMenu(){
        return menu;
    }
}
