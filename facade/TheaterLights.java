package facade;

public class TheaterLights {
    private final String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() { System.out.println(description + " on"); }
    public void off() { System.out.println(description + " off"); }
    public void dim(int percent) { System.out.println(description + " dimming to " + percent + "%"); }
}
