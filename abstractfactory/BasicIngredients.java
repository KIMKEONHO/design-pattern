package abstractfactory;

final class ThinCrustDough implements Dough { public String toString() { return "Thin Crust Dough"; } }
final class ThickCrustDough implements Dough { public String toString() { return "Thick Crust Dough"; } }
final class MarinaraSauce implements Sauce { public String toString() { return "Marinara Sauce"; } }
final class PlumTomatoSauce implements Sauce { public String toString() { return "Plum Tomato Sauce"; } }
final class ReggianoCheese implements Cheese { public String toString() { return "Reggiano Cheese"; } }
final class MozzarellaCheese implements Cheese { public String toString() { return "Mozzarella Cheese"; } }
final class Garlic implements Veggies { public String toString() { return "Garlic"; } }
final class Onion implements Veggies { public String toString() { return "Onion"; } }
final class Mushroom implements Veggies { public String toString() { return "Mushroom"; } }
final class RedPepper implements Veggies { public String toString() { return "Red Pepper"; } }
final class BlackOlive implements Veggies { public String toString() { return "Black Olives"; } }
final class Spinach implements Veggies { public String toString() { return "Spinach"; } }
final class Eggplant implements Veggies { public String toString() { return "Eggplant"; } }
final class SlicedPepperoni implements Pepperoni { public String toString() { return "Sliced Pepperoni"; } }
final class FreshClam implements Clam { public String toString() { return "Fresh Clam"; } }
final class FrozenClam implements Clam { public String toString() { return "Frozen Clam"; } }
