package singleton.ex5;

public class Main {

    public static void main(String[] args) {
        Singleton first = Singleton.UNIQUE_INSTANCE;
        Singleton second = Singleton.UNIQUE_INSTANCE;

        System.out.println("같은 인스턴스인가? " + (first == second));

        first.doSomething();
        second.doSomething();

        System.out.println("작업 횟수: " + Singleton.UNIQUE_INSTANCE.getCount());
    }
}
