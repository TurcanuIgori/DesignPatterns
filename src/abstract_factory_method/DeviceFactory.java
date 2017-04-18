package abstract_factory_method;

/**
 * Created by igori on 4/18/17.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Tachpad getTachpad();
}
