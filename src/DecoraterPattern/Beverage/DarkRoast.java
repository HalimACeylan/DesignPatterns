package DecoraterPattern.Beverage;

public class DarkRoast extends Beverage{
    private final String description = "Dark Roast";
    private final double cost = 0.22;


    @Override
    public String getDescription() {
        return  description;
    }
    public double cost(){
        return cost;
    }
}
