package strategy;

/**
 * Created by igori on 2/14/17.
 */
public class Sugar implements Adaos{

    private String name = "Sugar";

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}
