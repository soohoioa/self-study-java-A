package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    //첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    //두 번째 add 메서드:세 정수를 받아서 합을 반환한다.
    // 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
/*
**메서드 오버로딩(Overloading)**
이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩(Overloading) 이라 한다.
같은 이름의 메서드를 여러개 정의했다고 이해 하면 된다.

오버로딩 규칙
- 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다.
- 참고로 반환 타입은 인정하지 않는다.

**메서드 시그니처(method signature)**
`메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)`
- 메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다.
- 메서드의 이름과 매개변수 타입(순서 포함)으로 구성되어 있다. 쉽게 이야기해서 메서드를 구분할 수 있는 기준이다.
- 메서드 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주한다.
- 반환 타입은 시그니처에 포함되지 않는다.
 */