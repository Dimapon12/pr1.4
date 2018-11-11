import java.util.Random;

public class Waiter extends Person{
    Order order;

    public Waiter(String name) {
        super(name);
    }
    public void takeOrder(Menu m){
        System.out.println("Официант " + getName() + " принимает заказ");
        Random r = new Random();
        order = new Order(r.nextInt(m.dishesCount()));
        System.out.println("Заказан пункт меню номер: " + (order.getMenuIndx()+1));
        doOrder();
    }

    public void doOrder(){
        System.out.println("Официант " + getName() + " выполнил заказ");
    }
    public void takePay(){
        System.out.println("Официант " + getName() + " принял оплату");
    }
}
