package strategy;

/**
 * Created by igori on 2/14/17.
 */
public class CoffeImpl implements Coffe{

    private Adaos adaos;

    @Override
    public void setAdaos(Adaos adaos) {
        this.adaos = adaos;
    }

    @Override
    public Adaos getAdaos() {
        return adaos;
    }

    @Override
    public void display() {
        System.out.println(adaos.getName());
    }
}