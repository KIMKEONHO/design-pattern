package factorymethod;

import simplefactory.Pizza;

public class NYStyleCheezePizza extends Pizza {

    public NYStyleCheezePizza() {
        name = "뉴욕 스타일 치즈 피자";
        dough = "얇은 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("잘게 썬 레지아노 치즈");
    }
}
