package factorymethod;

import simplefactory.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheeze")){
            pizza = new NYStyleCheezePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (type.equals("하와이안")){
            pizza = new NYStyle하와이안Pizza();
        } else if (type.equals("스테이크 엔 치즈")){
            pizza = new NYStyle스테이크엔치즈Pizza();
        } else {
            System.out.println("오류 : 알 수 없는 피자");
            return null;
        }

        return pizza;
    }
}
