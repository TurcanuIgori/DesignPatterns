package factory_method;

/**
 * Created by igori on 4/4/17.
 */
public class MakeCarSedan implements Creator {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}
