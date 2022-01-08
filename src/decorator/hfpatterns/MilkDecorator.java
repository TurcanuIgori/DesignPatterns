package decorator.hfpatterns;

public class MilkDecorator extends BeverageDecorator {

    private int milkSupplementCost;

    public MilkDecorator(Beverage beverage, int milkSupplementCost) {
        super(beverage);
        this.milkSupplementCost = milkSupplementCost;
    }

    @Override
    public String getDescription() {
        return "Milk Decorator";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + milkSupplementCost;
    }
}
