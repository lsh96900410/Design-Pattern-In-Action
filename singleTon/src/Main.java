//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        SingletonBad instance1 = SingletonBad.getInstance();
//        SingletonBad instance2 = SingletonBad.getInstance();
//        SingletonBad instance3 = SingletonBad.getInstance();
//
//        System.out.println("instance1 = " + instance1);  // instance1 = Singleton@682a0b20
//        System.out.println("instance2 = " + instance2);  // instance2 = Singleton@682a0b20
//        System.out.println("instance3 = " + instance3);  // instance3 = Singleton@682a0b20
//
//        System.out.println("instance1 == instance2 = " + (instance1 == instance2)); // true
//        System.out.println("instance1 == instance3 = " + (instance1 == instance3)); // true
//        System.out.println("instance2 == instance3 = " + (instance2 == instance3)); // true


        /* Multi Thread In Action */
        Thread thread1 = new Thread(() -> {
            SingletonBad singleTon = SingletonBad.getInstance();
            System.out.println(singleTon);
        });

        Thread thread2 = new Thread(() -> {
            SingletonBad singleTon = SingletonBad.getInstance();
            System.out.println(singleTon);
        });

        Thread thread3 = new Thread(() -> {
            SingletonBad singleTon = SingletonBad.getInstance();
            System.out.println(singleTon);
        });
        thread1.start();
        thread2.start();
        thread3.start();

        // 널 체크를 진행하는 if문 블록을 스레드가 동시 접근 시, new 생성 이전이기에 스레드마다 인스턴스 생성
        /*
        SingletonBad@7977777d
        SingletonBad@6d7d3336
        SingletonBad@72fa99d7
        */

        System.out.println();
        System.out.println("------------ Synchronized Keyword ------------");
        Thread synThread1 = new Thread(() -> {
            SynchronizedSingleton singleTon = SynchronizedSingleton.getInstance();
            System.out.println(singleTon);
        });

        Thread synThread2 = new Thread(() -> {
            SynchronizedSingleton singleTon = SynchronizedSingleton.getInstance();
            System.out.println(singleTon);
        });

        Thread synThread3 = new Thread(() -> {
            SynchronizedSingleton singleTon = SynchronizedSingleton.getInstance();
            System.out.println(singleTon);
        });

        synThread1.start();
        synThread2.start();
        synThread3.start();





    }

}