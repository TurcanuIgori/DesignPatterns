package abstract_factory_method;

/**
 * Created by igori on 4/18/17.
 */
public class EnKeyboard implements Keyboard {
    @Override
    public void click() {
        System.out.println("click on EnKeyboard!");
    }
}
