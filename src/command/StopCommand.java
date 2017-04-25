package command;

/**
 * Created by igori on 4/25/17.
 */
public class StopCommand implements Command {

    private Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.stop();
    }
}
