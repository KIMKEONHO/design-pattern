package singleton.ex1;

/***
 * 싱글톤 예시 1
 * 기본적인 싱글톤으로 하나의 클래스에 하나의 인스턴스 생성만을 보장
 */
public class Singleton {

    private static Singleton singleton;

    // 생성자 private
    private Singleton(){

    }

    public static Singleton getInstance(){

        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
