package facade;

/**
 * Created by Igor on 4/2/2017.
 */
public class HDD {

    private DVD dvd;

    public HDD(DVD dvd) {
        this.dvd = dvd;
    }

    public void loadData(){
        if(dvd.isHasData()){
            System.out.println("load data...");
            System.out.println("succesfull loaded data!");
        }else{
            System.out.println("conect disk to DVD!");
        }
    }

}
