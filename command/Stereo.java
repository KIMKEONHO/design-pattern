package command;

public class Stereo {
    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is ON");
    }

    public void off() {
        System.out.println(location + " stereo is OFF");
    }

    public void setCd() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }
}
