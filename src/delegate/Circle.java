package delegate;

/**
 * Created by Igor on 4/2/2017.
 */
public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("from Circle!");
    }
}
