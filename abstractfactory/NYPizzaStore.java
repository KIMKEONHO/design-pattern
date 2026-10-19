package abstractfactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            return new VeggiePizza(ingredientFactory);
        }

        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}
