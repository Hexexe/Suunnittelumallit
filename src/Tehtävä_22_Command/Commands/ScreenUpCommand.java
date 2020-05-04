package Tehtävä_22_Command.Commands;
import Tehtävä_22_Command.Screen;

public class ScreenUpCommand implements Command {
    private Screen screen;
    public ScreenUpCommand(Screen screen) { this.screen = screen; }
    @Override
    public void execute() { screen.screenUp(); }
}
