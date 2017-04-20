import abstract_factory_method.*;
import composite.Circle;
import composite.Composite;
import composite.Shape;
import composite.Square;
import decorator.*;
import facade.Computer;
import prototype.Human;

import java.security.Key;

/**
 * Created by Igor on 4/2/2017.
 */
public class MainClass {
    public static void main(String[] args) {

//        test abstract factory!

//        DeviceFactory deviceFactory = getDeviceFactoryByCode("RU");
//
//        Mouse mouse = deviceFactory.getMouse();
//        Tachpad tachpad = deviceFactory.getTachpad();
//        Keyboard keyboard = deviceFactory.getKeyboard();
//
//        mouse.click();
//        keyboard.click();
//        tachpad.click();

//        test protorype!

//        Human original = new Human(18, "Vasya");
//        System.out.println(original.toString());
//
//        Human copy = (Human) original.copy();
//        System.out.println(copy.toString());

        Shape square = new Square();
        Shape triangle = new Square();
        Shape circle = new Circle();

        Composite composite = new Composite();

        composite.addShape(circle);
        composite.addShape(square);
        composite.addShape(triangle);

        Shape square1 = new Square();
        Shape triangle1 = new Square();
        Shape circle1 = new Circle();

        Composite composite1 = new Composite();

        composite1.addShape(circle1);
        composite1.addShape(square1);
        composite1.addShape(triangle1);
        composite1.addShape(composite);
        composite1.draw();
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
