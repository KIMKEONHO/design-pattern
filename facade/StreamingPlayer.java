package facade;

public class StreamingPlayer {
    private final String description;

    public StreamingPlayer(String description) {
        this.description = description;
    }

    public void on() { System.out.println(description + " on"); }
    public void off() { System.out.println(description + " off"); }
    public void pause() { System.out.println(description + " paused"); }
    public void play(String movie) { System.out.println(description + " playing \"" + movie + "\""); }
    public void stop() { System.out.println(description + " stopped"); }

    @Override
    public String toString() { return description; }
}
