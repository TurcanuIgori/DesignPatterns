package command;

/**
 * Created by igori on 4/25/17.
 */
public class ResetCommand implements Command {

    private Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.reset();
    }
}
