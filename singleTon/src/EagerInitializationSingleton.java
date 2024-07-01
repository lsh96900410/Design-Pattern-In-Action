/*
    Singleton Pattern to Thread Safe

    Eager Initialization - 이른 초기화 작업

    1. 변수 선언과 동시에 초기화 작업을 진행
    2. static final 키워드로 상수로 선언함으로써 전역에서 공유함과 변하지 않음을 보장
    3. 다만, 미리 초기화하면서 인스턴스를 생성하기에 메모리를 점유하여 메모리 낭비 가능성 존재

 */

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton SINGLETON = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance(){
        return SINGLETON;
    }
}
