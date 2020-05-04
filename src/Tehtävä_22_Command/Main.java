package Tehtävä_22_Command;

import Tehtävä_22_Command.Commands.Command;
import Tehtävä_22_Command.Commands.ScreenDownCommand;
import Tehtävä_22_Command.Commands.ScreenUpCommand;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command up = new ScreenUpCommand(screen);
        Command down = new ScreenDownCommand(screen);
        WallButton b1 = new WallButton(up);
        WallButton b2 = new WallButton(down);
        b1.push();
        b2.push();
    }
}
