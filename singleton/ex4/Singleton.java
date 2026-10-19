package singleton.ex4;

/**
 * 싱글톤 예시 4
 * 예시 2의 단점인 오버헤드 문제를 해결하기 위한 버전 2.
 */
public class Singleton {

    private volatile static Singleton singleton; // volatile 키워드를 통해 멀티스레딩에서 인스턴스 초기화되는 과정이 올바르게 진행

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
