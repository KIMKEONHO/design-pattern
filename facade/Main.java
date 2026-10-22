package facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Amplifier");
        StreamingPlayer player = new StreamingPlayer("Streaming Player");
        Projector projector = new Projector("Projector");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amplifier, player, projector, lights, screen, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
