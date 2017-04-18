package decorator;

/**
 * Created by igori on 4/13/17.
 */
public class ConcreteCoffe implements Coffe {

    private String decription;

    public ConcreteCoffe(String decription) {
        this.decription = decription;
    }

    @Override
    public void description() {
        System.out.print(decription);
    }
}
