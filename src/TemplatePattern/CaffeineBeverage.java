package TemplatePattern;

public abstract class CaffeineBeverage {

    final public void PrepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (hook()) {
            addCondiment();
        }
    }
    public abstract void brew();
    public abstract void addCondiment();

    void boilWater(){
        System.out.println("Boiling Water");
    }
    void pourInCup(){
        System.out.println("Pouring into cap");
    }

    boolean hook() {
        return true;
    }
}
