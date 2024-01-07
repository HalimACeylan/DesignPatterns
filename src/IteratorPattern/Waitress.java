package IteratorPattern;

import java.util.ArrayList;

public class Waitress {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerMenuIterator = dinerMenu.createIterator();
        System.out.println("Print Pancake MenuComponent ////////");
        printMenu(pancakeIterator);
        System.out.println("Print Dinner MenuComponent ////////");
        printMenu(dinnerMenuIterator);


    }

    private static void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem =(MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.isVegetarian());
            System.out.println(menuItem.getPrice());

        }

    }
}
