package abstractfactory;

public class VeggiePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        System.out.println("  Dough: " + dough);
        System.out.println("  Sauce: " + sauce);
        System.out.println("  Cheese: " + cheese);
        for (Veggies veggie : veggies) {
            System.out.println("  Veggie: " + veggie);
        }
    }
}
