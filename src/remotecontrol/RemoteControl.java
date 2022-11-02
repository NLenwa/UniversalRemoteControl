package remotecontrol;

import command.ICommand;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *  Base implementation for the remote control.
 */
public class RemoteControl implements IRemoteControl {

		private final Stack<ICommand> history = new Stack<>();
		public final static int NO_OF_ACTION_BUTTONS = 3;

		private ControlButton[] controlButtons;
		// TODO: Data structures for the actions

		public RemoteControl() {
			controlButtons = new ControlButton[NO_OF_ACTION_BUTTONS];

			// TODO: Initialize data structures for the actions
		}

		// TODO: Implement method for configuration of action buttons

	@Override
	public RemoteControl configButton(int number, ICommand command) {
		controlButtons[number] = new ControlButton(command);
		return this;
	}

	/**
		 * The action button was pressed.
		 * Depending on its status, it will execute an activate or deactivate action.
		 *
		 * @param number The number of the button.
		 */
		public void actionButtonPressed(int number) {
			controlButtons[number].click();
			history.push(controlButtons[number].commandButton);
		}

		/**
		 * The undo button was pressed.
		 * It will undo the previous action.
		 */
		public void undoButtonPressed() {
			System.out.println("Undo button pressed");
			try{
				history.pop().undo();
			} catch (EmptyStackException e){
				System.out.println("No history");
			}

		}
}
