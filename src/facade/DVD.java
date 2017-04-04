package facade;

/**
 * Created by Igor on 4/2/2017.
 */
public class DVD {

    private boolean hasData = false;

    public boolean isHasData() {
        return hasData;
    }

    void load(){
        this.hasData = true;
    }

    void unload(){
        this.hasData = false;
    }
}
