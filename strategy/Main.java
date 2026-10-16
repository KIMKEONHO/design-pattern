package strategy;

public class Main {

    public static void main(String[] args){

        Duck rubberDuck = new RubberDuck();
        Duck pigeonDuck = new PigeonDuck();

        rubberDuck.display();
        pigeonDuck.display();

    }

}