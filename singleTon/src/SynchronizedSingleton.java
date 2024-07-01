/*
    Singleton Pattern to Thread Safe

    synchronized 키워드 사용
    - getInstance() 메소드에 하나의 쓰레드만 접근을 할 수 있도록하기
    - 여러 쓰레드가 접근 요청을 할 시, Lock(동기화) 이유로 성능 저하가 발생할 수 있다.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton(){} // 외부에서 임의로 객체 생성 금지

    public static synchronized SynchronizedSingleton getInstance(){
        if(singleton == null){
            singleton = new SynchronizedSingleton();
        }
        return singleton;
    }

    public static SynchronizedSingleton doubleChecking(){
        if(singleton == null){

            synchronized (SynchronizedSingleton.class){

                if( singleton == null){
                    singleton = new SynchronizedSingleton();
                }

            }
        }
        return singleton;
    }
}

