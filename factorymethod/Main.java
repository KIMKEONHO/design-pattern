package factorymethod;

import simplefactory.Pizza;

public class Main {

    public static void main(String[] args){

        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore naplesPizzaStore = new NaplesStylePizzaStore();

        Pizza firstPizza = nyPizzaStore.orderPizza("cheeze");

        Pizza secondPizza = nyPizzaStore.orderPizza("하와이안");

        Pizza thirdPizza = naplesPizzaStore.orderPizza("cheeze");

        Pizza forthPizza = naplesPizzaStore.orderPizza("하와이안");


    }

}