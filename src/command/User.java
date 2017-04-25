package command;

/**
 * Created by igori on 4/25/17.
 */
public class User {
    private Command start;
    private Command stop;
    private Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void startComputer(){
        this.start.execute();
    }

    public void stopComputer(){
        this.stop.execute();
    }

    public void resetComputer(){
        this.reset.execute();
    }
}
