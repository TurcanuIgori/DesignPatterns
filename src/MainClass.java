import abstract_factory_method.*;
import decorator.*;
import facade.Computer;

import java.security.Key;

/**
 * Created by Igor on 4/2/2017.
 */
public class MainClass {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = getDeviceFactoryByCode("RU");

        Mouse mouse = deviceFactory.getMouse();
        Tachpad tachpad = deviceFactory.getTachpad();
        Keyboard keyboard = deviceFactory.getKeyboard();

        mouse.click();
        keyboard.click();
        tachpad.click();
    }

    public static DeviceFactory getDeviceFactoryByCode(String code){
        switch(code){
            case "EN":
                return new EnDeviceFactory();
            case "RU":
                return new RuDeviceFactory();
            default:
                throw new RuntimeException("Invalid code of localzation! Code: " + code);
        }
    }
}
