package builder;

/**
 * Created by igori on 4/13/17.
 */
public class ProductBuilder implements AbstractBuilder {

    @Override
    public Product createProduct(){
        return new ConcreteProduct();
    }

}
