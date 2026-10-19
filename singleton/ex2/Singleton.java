package singleton.ex2;

/**
 * 싱글톤 예시 2
 * 멀티스레딩 환경에서 한번에 하나의 스레드만 메서드 내부를 실행할 수 있게 synchronized 키워드 사용
 * 하지만 getInstance를 동기화를 해버리면 불필요한 오버헤드만 증가한다.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){

        if(singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }

}
