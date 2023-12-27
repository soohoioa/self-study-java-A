package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;

            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);

        /*
        switch 문
        `switch` 문은 앞서 배운 `if` 문을 조금 더 편리하게 사용할 수 있는 기능이다.
        참고로 `if` 문은 비교 연산자를 사용할 수 있지만, `switch` 문은 단순히 값이 같은지만 비교할 수 있다.
         `switch` 문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다.

            <switch 문>
            switch (조건식) {
                case value1:
                    // 조건식의 결과 값이 value1일 때 실행되는 코드
                    break;
                case value2:
                    // 조건식의 결과 값이 value2일 때 실행되는 코드
                    break;
                default:
                    // 조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드
            }
        - 조건식의 결과 값이 어떤 `case` 의 값과 일치하면 해당 `case` 의 코드를 실행한다.
        - `break` 문은 현재 실행 중인 코드를 끝내고 `switch` 문을 빠져나가게 하는 역할을 한다.
        - 만약 `break` 문이 없으면, 일치하는 `case` 이후의 모든 `case` 코드들이 순서대로 실행된다.
        - `default` 는 조건식의 결과값이 모든 `case` 의 값과 일치하지 않을 때 실행된다. `if` 문의 `else` 와 같다. `default` 구문은 선택이다.
        - `if` , `else-if` , `else` 구조와 동일하다.
         */
    }
}
