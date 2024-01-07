package IteratorPattern;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","Bacon with lettuce & tomato on whole wheat",false ,2.99);
        addItem("Soup of the day","Soup of the day,with a side of potato salad",false,3.29);
    }

    public void addItem(String name , String description, boolean vegetarian, double price){

        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
       if(numberOfItems >= MAX_ITEMS){
           System.out.println("Sorry the menu is full");
       }else {
           menuItems[numberOfItems] = menuItem;
           numberOfItems = numberOfItems + 1;
       }


    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}
