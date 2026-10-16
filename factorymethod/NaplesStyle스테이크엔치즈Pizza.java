package factorymethod;

import simplefactory.Pizza;

public class NaplesStyle스테이크엔치즈Pizza extends Pizza {

    public NaplesStyle스테이크엔치즈Pizza() {
        name = "나폴리 스타일 스테이크 앤 치즈 피자";
        dough = "나폴리식 얇은 도우";
        sauce = "토마토 소스";
        toppings.add("스테이크");
        toppings.add("양파");
        toppings.add("신선한 모차렐라 치즈");
    }
}
