package operator;

public class Operator4 { // 연산자 우선순위2
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        /*
        - 연산자 우선 순위는 2가지만 기억하면 된다.
            1. 상식선에서 우선 순위를 사용한다.
            2. 애매하면 괄호 ()를 사용한다.

        - 누구나 코드를 보고 쉽고 명확하게 이해할 수 있어야 한다.
            코드를 몇자 줄여서 모호하거나 복잡해 지는 것 보다는 코드가 더 많더라도 명확하고 단순한 것이 더 유지보수 하기 좋다.

        - 개발에서 가장 중요한 것은 단순함과 명확함이다. 애매하거나 복잡하면 안된다.
         */
    }
}
