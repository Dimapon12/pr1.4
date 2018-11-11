public class Visitor extends Person {
    public Visitor(String name) {
        super(name);
        System.out.println("Посетитель " + getName() + " пришел");
    }
    public boolean bookTable(Administrator a){
        System.out.println("Посетитель " + getName() + " пытается забронировать столик");
        if(!a.bookTable())
        {
            goOut();
            return false;
        }
        else return true;
    }

    public void makeOrder(Waiter w, Menu m){
            System.out.println("Посетитель " + getName() + " сделал заказ");
            w.takeOrder(m);
        }

        public void takeOrder(){
            System.out.println("Посетитель " + getName() + " принял заказ");
        }

        public void eat(){
            System.out.println("Посетитель " + getName() + " ест");
        }

        public void pay(Waiter w){
            System.out.println("Посетитель " + getName() + " оплатил заказ");
            w.takePay();
        }

        public void freeTable(Administrator a){
            a.unbookTable();
            System.out.println("Посетитель " + getName() + " освободил столик");
    }

    public void goOut(){
        System.out.println("Посетитель " + getName() + " ушел");
    }
}
