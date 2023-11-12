package DecoraterPattern.Beverage;

public class Espresso extends Beverage{
    private final String description = "Espresso";
    private final double cost = 0.5;



    @Override
    public String getDescription() {
        return description;
    }
    public double cost(){
         return cost;
    }
}
