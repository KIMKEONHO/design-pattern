package factorymethod;

import simplefactory.Pizza;

public class NaplesStyle하와이안Pizza extends Pizza {

    public NaplesStyle하와이안Pizza() {
        name = "나폴리 스타일 하와이안 피자";
        dough = "나폴리식 얇은 도우";
        sauce = "토마토 소스";
        toppings.add("햄");
        toppings.add("파인애플");
    }
}
