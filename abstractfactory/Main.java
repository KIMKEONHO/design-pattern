package abstractfactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheese = nyStore.orderPizza("cheese");
        System.out.println("Ordered: " + nyCheese.getName());

        Pizza chicagoVeggie = chicagoStore.orderPizza("veggie");
        System.out.println("Ordered: " + chicagoVeggie.getName());
    }
}
