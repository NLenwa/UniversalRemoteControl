package receiver;

public interface IReceiver {
    //Action ON/OFF
    public void on();
    public void off();

    //Action PLAY/PAUSE
    public void play();
    public void pause();

    //Action NEXT/PREVIOUS
    public void next();
    public void previous();
}
