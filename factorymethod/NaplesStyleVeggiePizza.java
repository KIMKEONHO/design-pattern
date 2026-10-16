package factorymethod;

import simplefactory.Pizza;

public class NaplesStyleVeggiePizza extends Pizza {

    public NaplesStyleVeggiePizza() {
        name = "나폴리 스타일 베지 피자";
        dough = "나폴리식 얇은 도우";
        sauce = "토마토 소스";
        toppings.add("토마토");
        toppings.add("양파");
        toppings.add("버섯");
        toppings.add("바질");
    }
}
