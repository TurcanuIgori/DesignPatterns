package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tzurc on 4/20/2017.
 */
public class Composite implements Shape {

    private List<Shape> composites = new ArrayList();

    public void removeShape(Shape shape){
        composites.remove(shape);
    }

    public void addShape(Shape shape){
        composites.add(shape);
    }

    @Override
    public void draw() {
        for(Shape shape:composites){
            shape.draw();
        }
    }
}
