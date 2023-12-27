package scope;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue); //출력:1
        System.out.println("doubleValue = " + doubleValue); //출력:1.5 (그대로 있음)
        /*
        `int` 형은 `double` 형보다 숫자의 표현 범위가 작다. 그리고 실수를 표현할 수도 없다. 따라서 이 경우 숫자가 손실되는 문제가 발생할 수 있다.
         */

        //doubleValue = 1.5
        intValue = (int) doubleValue;
        intValue = (int) 1.5; //doubleValue에 있는 값을 읽는다.
        intValue = 1; //(int)로 형변환 한다. intValue에 int형인 숫자 1을 대입한다.

        /*
        - 형변환을 한다고 해서 `doubleValue` 자체의 타입이 변경되거나 그 안에 있는 값이 변경되는 것은 아니다.
        - `doubleValue` 에서 읽은 값을 형변환 하는 것이다. `doubleValue` 안에 들어있는 값은 `1.5` 로 그대로 유지된다.
        - 참고로 변수의 값은 대입연산자( `=` )를 사용해서 직접 대입할 때만 변경된다.
         */
    }
}
