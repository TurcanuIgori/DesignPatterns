package command;

/**
 * Created by igori on 4/25/17.
 */
public class StartCommand implements Command {

    private Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.start();
    }
}
