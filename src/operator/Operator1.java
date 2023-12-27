package operator;

public class Operator1 { // 산술연산자
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // a - b = 2

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // a * b = 10

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // a - b = 2
        // int 형 은 정수이기 때문에 소수점 이하를 표함할 수 없음.

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // a % b = 1
        // 주의! 0 으로 나누기는 수학적으로 허용하지 않음. 프로그램 에러가 발생함.
        // Exception in thread "main" java.lang.ArithmeticException: / by zero 라는 에러 발생!
    }
}
