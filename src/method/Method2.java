package method;

public class Method2 {
    public static void main(String[] args) { // void 사용하면 반환 타입이 없다는 뜻이다.
        printHeader(); // 첫번째 수행
        System.out.println("프로그램이 동작합니다."); // 두번째 수행
        printFooter(); // 세번째 수행
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return; // void 의 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 ="); // void 를 사용해서 return 을 사용 안함
    }
} // printHeader() , printFooter() 메서드는 매개변수가 없고, 반환 타입도 없다.

/*
1. 매개변수가 없는 경우
선언: public static void printHeader() 와 같이 매개변수를 비워두고 정의하면 된다.
호출: printHeader(); 와 같이 인수를 비워두고 호출하면 된다.

2. 반환 타입이 없는 경우
선언: public static void printHeader() 와 같이 반환 타입을 void 로 정의하면 된다.
호출: printHeader(); 와 같이 반환 타입이 없으므로 메서드만 호출하고 반환 값을 받지 않으면 된다.
    -> String str = printHeader(); 반환 타입이 void 이기 때문에 이렇게 반환 값을 받으면 컴 파일 오류가 발생한다.

3. void 와 return 생략
모든 메서드는 항상 return 을 호출해야 한다.
그런데 반환 타입 void 의 경우에는 예외로 printFooter() 와 같이 생략해도 된다.
자바가 반환 타입이 없는 경우에는 return 을 마지막줄에 넣어준다.
참고로 return 을 만나면 해당 메서드는 종료된다.
 */


/*
메서드는 다음과 같이 정의한다.
public static int add(int a, int b) {
	//메서드 본문, 실행 코드
}
제어자 반환타입 메서드이름(매개변수 목록) {
	메서드 본문
}

제어자(Modifier): public , static 과 같은 부분이다.
반환 타입(Return Type): 메서드가 실행 된 후 반환하는 데이터의 타입을 지정한다. 메서드가 값을 반환하지 않는 경우, 없다는 뜻의 void 를 사용해야 한다. 예) void print(String str)
메서드 이름(Method Name): 메서드의 이름이다. 이 이름은 메서드를 호출하는 데 사용된다.
매개변수(Parameter): 입력 값으로, 메서드 내부에서 사용할 수 있는 변수이다. 매개변수는 옵션이다. 입력값이 필요 없는 메서드는 매개변수를 지정하지 않아도 된다. 예) add()
메서드 본문(Method Body): 실제 메서드의 코드가 위치한다. 중괄호 {} 사이에 코드를 작성한다.
 */