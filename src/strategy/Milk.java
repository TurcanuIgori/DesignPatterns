package strategy;

/**
 * Created by igori on 2/14/17.
 */
public class Milk implements Adaos{

    private String name = "Milk";

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}
