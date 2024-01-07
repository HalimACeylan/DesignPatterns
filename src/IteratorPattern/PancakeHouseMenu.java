package IteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;


    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast","Pancak with fried eggs,sausage",false,2.99);
        addItem("Regular Pancake Breakfast","Pancake with scrambled eggs and toast " , true, 2.99);
        addItem("Blueberry Pancakes" ,"Pancakes made with fresh blueberries ",true,3.49);

    }


    public  void addItem(String name, String description, boolean vegetarian, double price){

        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);

    }

    public Iterator createIterator(){
        return new PancakeMenuIterator(menuItems);
    }
}
