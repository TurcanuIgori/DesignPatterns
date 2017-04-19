package prototype;

/**
 * Created by tzurc on 4/19/2017.
 */
public class Human implements Copyable{

    private int id;
    private String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Human(id, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
