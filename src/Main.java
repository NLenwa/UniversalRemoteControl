import command.NextPreviousCommand;
import command.OnOffCommand;
import command.PlayPauseCommand;
import receiver.IReceiver;
import receiver.MediaPlayer;
import remotecontrol.RemoteControl;


/**
 * Main for testing the functionality
 */
public class Main {
	public static void main(String[] args) {

		IReceiver device = new MediaPlayer();
		RemoteControl mediaPlayerRemote = new RemoteControl()
				.configButton(0, new OnOffCommand(device))
				.configButton(1, new PlayPauseCommand(device))
				.configButton(2, new NextPreviousCommand(device));

		// TODO: configure the remote controls for the media player remote


		// TODO: test the functionality by pressing different buttons similar to below
//		mediaPlayerRemote.actionButtonPressed(0);
//		mediaPlayerRemote.actionButtonPressed(1);
//		mediaPlayerRemote.actionButtonPressed(2);
//		mediaPlayerRemote.actionButtonPressed(2);
//		mediaPlayerRemote.actionButtonPressed(1);
//
//		mediaPlayerRemote.actionButtonPressed(0);
//		mediaPlayerRemote.undoButtonPressed();
//
//		mediaPlayerRemote.actionButtonPressed(1);
//		mediaPlayerRemote.undoButtonPressed();
//
//		mediaPlayerRemote.actionButtonPressed(2);
//		mediaPlayerRemote.undoButtonPressed();
//		mediaPlayerRemote.undoButtonPressed();


		// Undo test - START
		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(2);
		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(0);
		mediaPlayerRemote.actionButtonPressed(1);

		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		// Undo test - END

	}
}

