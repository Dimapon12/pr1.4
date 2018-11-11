import java.util.Scanner;

public class Main {

    private static final int TABLES_COUNT = 3;
    private static final int WAITERS_COUNT = 2;

    public static void main(String[] args) {
        Administrator a = new Administrator("Петр");
        Waiter[] waiters = new Waiter[WAITERS_COUNT];
        waiters[0] = new Waiter("Александр");
        waiters[1] = new Waiter("Максим");
        Restaurant res = new Restaurant(a, waiters, TABLES_COUNT);
        Visitor[] vis = new Visitor[TABLES_COUNT];
        int cnt = 0;

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("1. Приходит посетитель.\n" +
                               "2. Посетитель уходит.\n"+
                               "3. Администратор добавляет пункт в меню.\n" +
                               "4. Администратор убирает пункт из меню.\n" +
                               "5. Вихiд.");
            int command = in.nextInt();
            in.nextLine();
            switch (command){
                case 1: {
                    Visitor v = new Visitor(Integer.toString(cnt+1));
                    if(!v.bookTable(res.getAdmin())) break;
                    v.makeOrder(res.getWaiter(), res.getMenu());
                    v.takeOrder();
                    v.eat();
                    vis[cnt] = v;
                    cnt++;
                    break;
                }
                case 2: {
                    vis[cnt-1].pay(res.getWaiter());
                    vis[cnt-1].freeTable(res.getAdmin());
                    vis[cnt-1].goOut();
                    cnt--;
                    break;
                }
                case 3: {
                    System.out.println("Название блюда:");
                    String dish = in.nextLine();
                    a.addToMenu(res.getMenu(), dish);
                    res.getMenu().print();
                    break;
                }
                case 4: {
                    res.getMenu().print();
                    System.out.println("Номер для удаления:");
                    command = in.nextInt();
                    res.getMenu().remove(command);
                    res.getMenu().print();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }
    }
}
