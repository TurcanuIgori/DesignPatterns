package delegate;

/**
 * Created by Igor on 4/2/2017.
 */
public class Pointer {

    private Graphics graphics;

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void drow(){
        this.graphics.draw();
    }
}
