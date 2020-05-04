package Tehtävä_22_Command;

import Tehtävä_22_Command.Commands.Command;

public class WallButton {
    Command command;
    public WallButton(Command command) { this.command = command; }
    public void push() { command.execute(); }
}
