package factorymethod;

import simplefactory.Pizza;

public class NaplesStyleCheezePizza extends Pizza {

    public NaplesStyleCheezePizza() {
        name = "나폴리 스타일 치즈 피자";
        dough = "나폴리식 얇은 도우";
        sauce = "토마토 소스";
        toppings.add("신선한 모차렐라 치즈");
        toppings.add("바질");
    }
}
