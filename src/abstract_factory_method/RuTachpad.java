package abstract_factory_method;

/**
 * Created by igori on 4/18/17.
 */
public class RuTachpad implements Tachpad{
    @Override
    public void click() {
        System.out.println("click on RuTachpad!");
    }
}
