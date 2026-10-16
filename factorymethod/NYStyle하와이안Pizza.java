package factorymethod;

import simplefactory.Pizza;

public class NYStyle하와이안Pizza extends Pizza {

    public NYStyle하와이안Pizza() {
        name = "뉴욕 스타일 하와이안 피자";
        dough = "얇은 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("햄");
        toppings.add("파인애플");
    }
}
