package strategy;

public class PigeonDuck extends Duck{

    public PigeonDuck(){
        setFlyBehavior(new NonFly());
        setQuackBehavior(new Quack());
        setName("비둘기오리");
    }

}
