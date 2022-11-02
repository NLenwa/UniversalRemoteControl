package command;

import command.states.OnOffEnum;
import command.states.PlayPauseEnum;
import receiver.IReceiver;

public class PlayPauseCommand implements ICommand {

    private IReceiver controlDevice;
    private PlayPauseEnum state;


    public PlayPauseCommand(IReceiver device){
        controlDevice = device;
        this.state = PlayPauseEnum.PLAY;
    }
    @Override
    public void execute() {
        switch (state) {
            case PLAY->{
                controlDevice.pause();
                state = PlayPauseEnum.PAUSE;
            }
            case PAUSE -> {
                controlDevice.play();
                state = PlayPauseEnum.PLAY;
            }
        }
    }

    @Override
    public void undo() {
        execute();
        System.out.println("Undid RESUMED/PAUSED");
    }
}
