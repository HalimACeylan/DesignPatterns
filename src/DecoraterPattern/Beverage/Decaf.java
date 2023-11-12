package DecoraterPattern.Beverage;

public class Decaf extends Beverage{
    private final String description = "Decaf";
    private final double cost = 0.3;



    @Override
    public String getDescription() {
        return description;
    }
    public double cost(){
        return cost;
    }
}