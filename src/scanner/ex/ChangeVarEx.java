package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {

        /*
        예제5. "변수 값 교환"
        변수 a = 10 이 들어있고, b = 20 이 들어있다.
        변수 a 의 값과 변수 b 의 값을 서로 바꾸어라.
        힌트 : temp 변수를 활용 해야한다.
         */

        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        풀이
        1. a 와 b 를 한번에 서로 교환 불가.
        2. a = b 라고 한다면 a 의 값인 10 은 사라짐. -> a, b 둘 다 20 이 됨.
        3. a = b 라 하기 전에 a 의 값을 임시 사용 변수인 temp 에 보관함.
         */
    }
}
