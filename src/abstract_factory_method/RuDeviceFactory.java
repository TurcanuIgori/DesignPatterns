package abstract_factory_method;

/**
 * Created by igori on 4/18/17.
 */
public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Tachpad getTachpad() {
        return new RuTachpad();
    }
}
