package observer;

/**
 * Created by igori on 2/14/17.
 */
public class ObserverImpl implements Observer {

    private String name = null;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void update(int i){
        System.out.println(i + " " + this.getName());
    }
}
