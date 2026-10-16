package simplefactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println(name + " 준비");
        System.out.println("도우: " + dough);
        System.out.println("소스: " + sauce);

        for (String topping : toppings) {
            System.out.println("토핑 추가: " + topping);
        }
    }

    public void bake() {
        System.out.println("피자 굽기");
    }

    public void cut() {
        System.out.println("피자 자르기");
    }

    public void box() {
        System.out.println("피자 포장하기");
    }

    public String getName() {
        return name;
    }

}
