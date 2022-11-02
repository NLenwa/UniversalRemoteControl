package remotecontrol;

import command.ICommand;

public class ControlButton {
    ICommand commandButton;

    public ControlButton(ICommand command){
        commandButton = command;
    }
    public void click(){
        commandButton.execute();
    }
}
