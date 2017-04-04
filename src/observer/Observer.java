package observer;

/**
 * Created by igori on 2/14/17.
 */
public interface Observer {

    void setName(String name);
    String getName();
    void update(int i);
}
