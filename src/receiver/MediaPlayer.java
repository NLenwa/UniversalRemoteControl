package receiver;

public class MediaPlayer implements IReceiver {

    @Override
    public void on() {
        System.out.println("MP: ON");
    }

    @Override
    public void off() {
        System.out.println("MP: OFF");
    }

    @Override
    public void play() {
        System.out.println("MP: PLAY");
    }

    @Override
    public void pause() {
        System.out.println("MP: PAUSE");
    }

    @Override
    public void next() {
        System.out.println("MP: NEXT");
    }

    @Override
    public void previous() {
        System.out.println("MP: PREVIOUS");
    }
}
