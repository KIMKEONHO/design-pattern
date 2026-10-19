package abstractfactory;

public class CheesePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Cheese Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("  Dough: " + dough);
        System.out.println("  Sauce: " + sauce);
        System.out.println("  Cheese: " + cheese);
    }
}
