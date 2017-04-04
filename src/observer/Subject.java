package observer;

import java.util.List;

/**
 * Created by igori on 2/14/17.
 */
public interface Subject {

    void addObserver(Observer ob);

    void rmObserver(Observer ob);

    void updateAll();
}
