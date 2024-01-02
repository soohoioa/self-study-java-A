package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
/*
- `ConstructInit` 과 같이 생성자를 사용해서 `final` 필드를 초기화 하는 경우, 각 인스턴스마다 `final` 필드에 다른 값을 할당할 수 있다.
- `final` 을 사용했기 때문에 생성 이후에 이 값을 변경하는 것은 불가능하다.
 */

/*
- 여기서는 `FieldInit` 인스턴스의 모든 `value` 값은 `10` 이 된다.
- 왜냐하면 생성자 초기화와 다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해져있기 때문이다.
- 모든 인스턴스가 같은 값은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다.
- 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자가 보기에 명확한 중복이다.
- 이럴 때 사용하면 좋은 것이 바로 `static` 영역이다.

**static final**
- FieldInit.MY_VALUE` 는 `static` 영역에 존재한다.
  - 그리고 `final` 키워드를 사용해서 초기화 값이 변하지않는다.
- `static` 영역은 단 하나만 존재하는 영역이다.
  - `MY_VALUE` 변수는 JVM 상에서 하나만 존재하므로 앞서 설명한 중복과 메모리 비효율 문제를 모두 해결할 수 있다.

이런 이유로 필드에 [`final` + 필드 초기화]를 사용하는 경우 `static` 을 붙여서 사용하는 것이 효과적이다.
 */