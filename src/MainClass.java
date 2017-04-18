import decorator.*;
import facade.Computer;

/**
 * Created by Igor on 4/2/2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Coffe coffe = new Sugar(new Milk(new ConcreteCoffe("Water + Coffe")));
        coffe.description();
    }
}
