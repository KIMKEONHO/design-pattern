package simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){

        if(type.equals("cheese")){
            return new CheesePizza();
        } else if (type.equals("peperony")) {
            return new PeperonyPizza();
        }else{
            throw new RuntimeException("알 수 없는 피자입니다.");
        }

    }

}
