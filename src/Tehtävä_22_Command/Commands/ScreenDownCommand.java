package Tehtävä_22_Command.Commands;
import Tehtävä_22_Command.Screen;

public class ScreenDownCommand implements Command {
    private Screen screen;
    public ScreenDownCommand(Screen screen) { this.screen = screen; }
    @Override
    public void execute() { screen.screenDown(); }
}
