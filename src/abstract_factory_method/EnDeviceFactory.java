package abstract_factory_method;

/**
 * Created by igori on 4/18/17.
 */
public class EnDeviceFactory implements DeviceFactory{

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Tachpad getTachpad() {
        return new EnTachpad();
    }
}
