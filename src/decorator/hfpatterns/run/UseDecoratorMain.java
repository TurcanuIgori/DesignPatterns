package decorator.hfpatterns.run;

import decorator.hfpatterns.Express;
import decorator.hfpatterns.Latte;
import decorator.hfpatterns.MilkDecorator;
import decorator.hfpatterns.SugarDecorator;

public class UseDecoratorMain {
    public static void main(String[] args) {
        Latte latte = new Latte();
        SugarDecorator sugarDecorator = new SugarDecorator(latte, 2);
        MilkDecorator milkDecorator = new MilkDecorator(sugarDecorator, 3);
        System.out.println("Latte price: " + milkDecorator.getCost());

        Express express = new Express();
        SugarDecorator sugarDecoratorForExpress = new SugarDecorator(express, 2);
        System.out.println("Express price: " + sugarDecoratorForExpress.getCost());
    }
}
