public class Menu {
    private String[] foodList;

    public Menu()
    {
        foodList = new String[2];
        foodList[0] = "Рыба";
        foodList[1] = "Вода";
    }
    public void add(String title){
        String[] newList = new String[foodList.length+1];
        for(int i = 0; i < foodList.length; i++){
            newList[i] = foodList[i];
        }
        newList[newList.length-1] = title;
        foodList = newList;
    }
    public void remove(int number){
        String[] newList = new String[foodList.length-1];
        boolean flag = false;
        for(int i = 0; i < newList.length; i++){
            if(i == number-1) flag = true;
            if(flag)
                newList[i] = foodList[i+1];
            else
                newList[i] = foodList[i];
        }
        foodList = newList;
    }
    public int dishesCount()
    {
        return foodList.length;
    }
    public void print(){
        System.out.println("Меню:");
        for(int i = 0; i < foodList.length; i++){
            System.out.println(i+1 + ". " + foodList[i]);
        }
    }
}
