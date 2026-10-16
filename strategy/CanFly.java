package strategy;

public class CanFly implements FlyBehavior{


    @Override
    public void fly() {
        System.out.println("난 날 수 있다 ! 슈발!!!");
    }
}
