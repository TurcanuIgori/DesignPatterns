package decorator;

/**
 * Created by igori on 4/13/17.
 */
public class Adaos implements Coffe {

    protected Coffe coffe = null;

    public Adaos(Coffe coffe) {
        this.coffe = coffe;
    }

    public void description(){};
}
