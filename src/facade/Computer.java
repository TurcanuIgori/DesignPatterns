package facade;

/**
 * Created by igori on 4/4/17.
 */
public class Computer {

    Power power = new Power();
    DVD dvd = new DVD();
    HDD hdd = new HDD();

    public void copy(){
        power.on();
        dvd.load();
        hdd.loadData(dvd);
    }
}
