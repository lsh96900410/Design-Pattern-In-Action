/*
    정적 내부 클래스(static inner class)를 통해 헬퍼 클래스(Helper Class)로 동작하는 방식

    헬퍼 클래스 내부에서 static final 키워드를 사용해 메모리에 미리 할당 후, 불변성 보장
    -> 여러 쓰레드 접근 상황의 동시성 문제와 가독성 증가

    Java Reflection, serialization 작업으로 싱글톤 파괴 가능성 존재
 */

public class BillPughSolution {

    private BillPughSolution(){}


    private static class SingletonHelper {
        private static final BillPughSolution INSTANCE = new BillPughSolution();
    }

    public static BillPughSolution getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
