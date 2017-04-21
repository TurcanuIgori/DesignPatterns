package adapter;

/**
 * Created by tzurc on 4/21/2017.
 */
public class CircleAdapToShape extends Circle implements Shape {
    @Override
    public void drawShape() {
        drawCircle();
    }

    @Override
    public void removeShape() {
        removeCircle();
    }
}
