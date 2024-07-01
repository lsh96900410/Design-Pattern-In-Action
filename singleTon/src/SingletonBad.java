/*
 *  싱글톤 객체
 *
 *  단일 객체로 존재하기 때문에 공유 객체로 사용된다.
 *  그렇기에, 상태 값을 가지는 필드는 지양하는 것이 좋다.
 *
 */


public class SingletonBad {

    private static SingletonBad singleton;

    private SingletonBad(){} // 외부에서 임의로 객체 생성 금지

    public static SingletonBad getInstance(){
        if(singleton == null){
            singleton = new SingletonBad();
        }
        return singleton;
    }

}
