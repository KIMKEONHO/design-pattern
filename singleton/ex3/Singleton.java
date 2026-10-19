package singleton.ex3;

/**
 * 싱글톤 예시 3
 * 예시 2의 단점인 오버헤드 문제를 해결하기 위한 버전 1.
 */
public class Singleton {

    private static Singleton singleton = new Singleton(); // 정적 생성 부분에서 인스턴스를 생성

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

}


