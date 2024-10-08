# Singleton Pattern

하나의 클래스에 오직 하나의 인스턴스만 가지도록 하면서 인스턴스에 대한 전역 접근(엑세스) 지점을 제공하는 생성 패턴이다.

하나의 인스턴스를 만들어 놓고 다른 모듈들이 공유하며 사용하기에 인스턴스 생성 비용이 줄어든다.
하지만, 모든 모듈이 하나의 인스턴스만을 사용하기에 의존성이 높아진다는 단점이 있다. 
이러한 의존성이 높아지는 단점은 TDD(Test Driven Development)를 할 떄 걸림돌이 된다.
단위 테스트 상황에서 테스트가 서로 독립적으로 진행되며 어느 순서로도 실행할 수 있어야 한다.

하지만, 싱글톤 패턴은 미리 생성된 인스턴스를 기반으로 구현하는 패턴이기에 테스트마다 독립적인 인스턴스를 만들기 어렵다.

### 의존성 주입
싱글톤 패턴은 사용하기가 쉽고 굉장히 실용적이지만 모듈 간의 결합을 강하게 만들 수 있다는 단점이 있다.
이때 의존성 주입(DI, Dependency Injection)을 통해 모듈간의 결합을 조금 더 느슨하게 만들어 해결할 수 있다.

의존성 주입은 모듈들을 쉽게 교체할 수 있는 구조가 되어 테스팅하기 쉽고 마이그레이션하기도 수월하다.
또한, 구현할 때 추상화 레이어를 두고 이를 기반으로 구현체를 넣어 주기 때문에 의존성 방향이 일관되고, 추론이 쉬우며 모듈 간 관계가 명확해진다.

하지만, 모듈이 분리됨에 따라 클래스 수가 늘어나 복잡성이 증가될 수 있고, 약간의 런타임 패널티가 생긴다.

#### 의존성 주입 원칙
"상위 모듈은 하위 모듈에서 어떠한 것도 가져오지 않아야 한다."
둘 다 추상화에 의존해야 하며, 이때 추상화는 세부 사항에 의존하지 말아야 한다.





싱글턴 패턴은 한 번에 두 가지의 문제를 동시에 해결함으로써 단일 책임 원칙을 위반한다.

1. 클래스에 인스턴스가 하나만 있도록 한다 
2. 해당 인스턴스에 대한 전역 접근 지점을 제공한다


## 사용 이유
커넥션, 스레드, 설정 객체 등과 같은 경우 인스턴스가 많아짐에 따라 불필요한 자원을 사용하게 된다.

## 장점
1. 유일한 인스턴스 보장 - 객체의 일관된 상태 유지 + 전역에서 접근 가능
2. 메모리 절약 - 인스턴스가 단 하나이기에 메모리 점유 및 해제에 대한 오버헤드를 줄인다.
3. 지연 초기화 - 인스턴스가 실제로 사용되는 시점에 생성하여 초기 비용을 줄일 수 있다.

## 단점
1. 결합도 증가 - 전역에서 접근을 허용하기에 해당 인스턴스에 의존하는 경우 결합도 증가
2. 테스트 복잡성 - 단위 테스트 상황에서 의존성 문제로 독립 테스트 어려움
3. 상태 관리 - 전역에서 하나의 인스턴스를 접근하고 사용하기에 예상치 못한 동작 가능성 
4. 전역 접근성 - 애플리케이션 내 어디서든 접근이 가능한 경우, 무분별한 사용을 막기 힘들고 변경 복잡성 증가 


`싱글톤 패턴은 메모리 효율성을 높일 수 있지만, 그로 인한 문제점이 존재하기에 상황에 알맞게 고려하여 사용 권장`




