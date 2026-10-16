package strategy;

public class RubberDuck extends Duck{

    public RubberDuck(){
        setName("고무오리");
        setFlyBehavior(new NonFly());
        setQuackBehavior(new Squeak());
    }

}
