package scope;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과) , int 최고값을 넘었기에 long 사용.
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648

        /*
        - 결과를 보면 `-2147483648` 이라는 전혀 다른 숫자가 보인다. `int` 형은 `2147483648L` 를 표현할 수 있는 방법이 없다.
        이렇게 기존 범위를 초과해서 표현하게 되면 전혀 다른 숫자가 표현되는데, 이런 현상을 오버플로우라 한다.
        - 보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다. 참고로 `-2147483648` 숫 자는 `int` 의 가장 작은 숫자이다.
        - 중요한 것은 오버플로우가 발생하는 것 자체가 문제라는 점이다! 오버플로우 자체가 발생하지 않도록 막아야 한다.
        이 경우 단순히 대입하는 변수(`intValue` )의 타입을 `int` `long` 으로 변경해서 사이즈를 늘리면 오버플로우 문제가 해결 된다.
         */
    }
}
