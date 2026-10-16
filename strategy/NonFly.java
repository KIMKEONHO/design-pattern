package strategy;

public class NonFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("난 못 난다 !! 슈발 !!!");
    }
}
