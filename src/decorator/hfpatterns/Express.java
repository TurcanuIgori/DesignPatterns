package decorator.hfpatterns;

public class Express implements Beverage {
    @Override
    public String getDescription() {
        return "Express";
    }

    @Override
    public int getCost() {
        return 15;
    }
}
