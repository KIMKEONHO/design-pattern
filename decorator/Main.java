package decorator;


public class Main {

    public static void main(String[] args){

        // 1번 고객
        Beverage beverage = new Americano();
        System.out.println(beverage.getDescription() + "의 가격은 : " + beverage.cost() + "입니다." );

        // 2번 고객 (모카 2샷 추가, 휘핑 추가)
        Beverage beverage1 = new Americano();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + "의 가격은 : " + beverage1.cost() + "입니다.");


    }

}