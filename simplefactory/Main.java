package simplefactory;

public class Main {

    public static void main(String[] args){

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("cheese");

        System.out.println("주문한 피자: " + pizza.getName());

    }

}