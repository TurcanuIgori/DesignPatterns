package adapter;

/**
 * Created by tzurc on 4/21/2017.
 */
public class CircleAdaptToShape implements Shape {

    private Circle circle;

    public CircleAdaptToShape(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void drawShape() {
        circle.drawCircle();
    }

    @Override
    public void removeShape() {
        circle.removeCircle();
    }
}
