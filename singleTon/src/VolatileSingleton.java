/*
   Volatile Keyword + double Check

   1. getInstance() 메소드를 호출할 때마다 동기화 작업 X, 초기화 시에만 동기화 작업 진행

   Volatile Keyword ?

   기존 작업은 메인 메모리로부터 값을 복사해 CPU 캐시에 저장하여 작업을 진행한다.
   그렇기에 멀티 코어 + 멀티 스레드 환경에서 각 스레드는 서로 다른 CPU 로 동작한다.
   이는 메인 메모리 값과 CPU 캐시 값이 다른 상황이 발생한다.

   이러한 문제 상황은 Volatile 키워드를 선언한 변수는 모든 읽기, 쓰기 작업이 cpu 캐시가 아닌 메인 메모리에서 진행
   그렇기에, 변수 값에 대한 가시성 확보 가능 != 동시성 문제를 해결한다


  즉, Volatile 키워드로 모든 스레드가 항상 같은 공유 변수 값 접근을 보장한 후
  여러 스레드가 접근할 시 synchronized 로 동기화 작업 진행
 */

public class VolatileSingleton {

    private static volatile VolatileSingleton singleton;

    private VolatileSingleton(){}

    public static VolatileSingleton getInstance(){
        if(singleton == null){
            // if문 진입 시, 해당 클래스에 대한 동기화 작업 진행
            synchronized (VolatileSingleton.class){

                if( singleton == null){
                    singleton = new VolatileSingleton();
                }

            }
        }
        return singleton;
    }

}
