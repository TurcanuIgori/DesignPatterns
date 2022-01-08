package decorator.hfpatterns;

public class SugarDecorator extends BeverageDecorator {

    private int sugarSupplementCost;

    public SugarDecorator(Beverage beverage, int sugarSupplementCost) {
        super(beverage);
        this.sugarSupplementCost = sugarSupplementCost;
    }

    @Override
    public String getDescription() {
        return "Sugar";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + sugarSupplementCost;
    }
}
