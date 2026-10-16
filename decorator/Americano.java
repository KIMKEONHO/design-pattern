package decorator;

public class Americano extends Beverage{

    public Americano(){
        description = "아메리카노";
    }

    @Override
    public double cost() {
        return 1500;
    }
}
