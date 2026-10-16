package factorymethod;

import simplefactory.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "뉴욕 스타일 베지 피자";
        dough = "얇은 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("마늘");
        toppings.add("양파");
        toppings.add("버섯");
        toppings.add("피망");
    }
}
