package decorator;

/**
 * Created by igori on 4/13/17.
 */
public class Sugar extends Adaos {

    private final String description = "Sugar";

    public Sugar(Coffe coffe) {
        super(coffe);
    }

    public void description(){
        System.out.print(description + " + ");
        this.coffe.description();
    }
}
