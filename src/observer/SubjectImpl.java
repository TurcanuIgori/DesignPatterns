package observer;

import java.util.ArrayList;
import java.util.List;

/**`
 * Created by igori on 2/14/17.
 */
public class SubjectImpl implements Subject{

    List<Observer> observers = new ArrayList();

    @Override
    public void addObserver(Observer ob){
        observers.add(ob);
    }

    @Override
    public void rmObserver(Observer ob){
        observers.remove(ob);
    }

    @Override
    public void updateAll(){
        int i=0;
        for(Observer ob:observers){
            ob.update(i);
            i++;
        }
    }
}