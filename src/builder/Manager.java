package builder;

/**
 * Created by igori on 4/13/17.
 */
public class Manager {
    AbstractBuilder abstractBuilder = null;

    public Manager(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }
    public Product creteProduct(){
        return abstractBuilder.createProduct();
    }
}
