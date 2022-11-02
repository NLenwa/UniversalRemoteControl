package command;

import command.states.NextPreviousEnum;
import command.states.OnOffEnum;
import receiver.IReceiver;

public class NextPreviousCommand implements ICommand{
    private IReceiver controlDevice;
    private NextPreviousEnum state;


    public NextPreviousCommand(IReceiver device){
        controlDevice = device;
        this.state = NextPreviousEnum.PREVIOUS;
    }


    @Override
    public void execute() {
        switch (state) {
            case PREVIOUS->{
                controlDevice.next();
                state = NextPreviousEnum.NEXT;
            }
            case NEXT -> {
                controlDevice.previous();
                state = NextPreviousEnum.PREVIOUS;
            }
        }
    }

    @Override
    public void undo() {
        execute();
        System.out.println("Undid ON/OFF");
    }
}
