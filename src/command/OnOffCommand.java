package command;

import command.states.OnOffEnum;
import receiver.IReceiver;

public class OnOffCommand implements ICommand {

    private IReceiver controlDevice;
    private OnOffEnum state;


    public OnOffCommand(IReceiver device){
        controlDevice = device;
        this.state = OnOffEnum.ON;
    }

    @Override
    public void execute() {
        switch (state) {
                case ON->{
                    controlDevice.off();
                    state = OnOffEnum.OFF;
                    System.out.println("Turned OFF");
                }
                case OFF -> {
                    controlDevice.on();
                    state = OnOffEnum.ON;
                    System.out.println("Turned ON");
                }
        }
    }

    @Override
    public void undo() {
        execute();
        System.out.println("Undid ON/OFF");
    }
}
