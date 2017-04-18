package decorator;

/**
 * Created by igori on 4/13/17.
 */
public class Milk extends Adaos {

    private final String description = "Milk";

    public Milk(Coffe coffe) {
        super(coffe);
    }

    public void description(){
        this.coffe.description();
        System.out.println(" + " + description);
    }
}
