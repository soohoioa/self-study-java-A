package static2;

public class DecoData {
    // 접근 제어자를 적극 활용해서 필드를 포함한 외부에서 직접 필요하지 않은 기능은 모두 막아두었다.
    private int instanceValue; // 인스턴스 변수이다.
    private static int staticValue; // 정적 변수(클래스 변수)이다.

    public static void staticCall() {
        // instanceValue++; //인스턴스 변수 접근, compile error
        // instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }
    /*
    - 이 메서드는 정적 메서드이다.
    - 따라서 `static` 만 사용할 수 있다.
    - 정적 변수, 정적 메서드에는 접근할 수 있지만, `static` 이 없는 인스턴스 변수나 인스턴스 메서드에 접근하면 **컴파일 오류가 발생**한다.
    - 코드를 보면 `staticCall()` `staticMethod()` 로 `static` 에서 `static` 을 호출하는 것을 확인할 수 있다.
     */

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }
    /*
    - 이 메서드는 인스턴스 메서드이다.
    - 모든 곳에서 공용인 `static` 을 호출할 수 있다.
    - 따라서 정적 변수, 정적 메서드에 접근할 수 있다.
    - 물론 인스턴스 변수, 인스턴스 메서드에도 접근할 수 있다.
     */

    private void instanceMethod() { // 인스턴스 메서드이다.
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod() { // 정적 메서드(클래스 메서드)이다.
        System.out.println("staticValue = " + staticValue);
    }

}
