package singleton.ex5;

/**
 * 싱글톤 예시 5
 * enum을 사용한 싱글톤.
 *
 * enum의 인스턴스는 JVM이 하나만 생성하므로 별도의 private 생성자,
 * 인스턴스 필드, getInstance() 메서드를 직접 작성할 필요가 없다.
 */
public enum Singleton {

    UNIQUE_INSTANCE;

    private int count;

    public void doSomething() {
        count++;
        System.out.println("Singleton 작업 실행: " + count);
    }

    public int getCount() {
        return count;
    }
}
