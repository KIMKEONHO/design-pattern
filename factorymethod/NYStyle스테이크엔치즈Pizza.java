package factorymethod;

import simplefactory.Pizza;

public class NYStyle스테이크엔치즈Pizza extends Pizza {

    public NYStyle스테이크엔치즈Pizza() {
        name = "뉴욕 스타일 스테이크 앤 치즈 피자";
        dough = "얇은 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("스테이크");
        toppings.add("양파");
        toppings.add("모차렐라 치즈");
    }
}
