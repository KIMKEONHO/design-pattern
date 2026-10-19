package abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            return new VeggiePizza(ingredientFactory);
        }

        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}
