package facade;

/**
 * Created by Igor on 4/2/2017.
 */
public class HDD {

    public HDD() {
    }

    public void loadData(DVD dvd){
        if(dvd.isHasData()){
            System.out.println("load data...");
            System.out.println("succesfull loaded data!");
        }else{
            System.out.println("conect disk to DVD!");
        }
    }

}
