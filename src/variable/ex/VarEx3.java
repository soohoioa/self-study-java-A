package variable.ex;

public class VarEx3 {
    public static void main(String[] args) {

        /*
        문제3. long, boolean 데이터 타입

        `long` 타입의 변수를 선언하고, 그 변수를 10000000000(백억)으로 초기화한 후 출력하는 프로그램을 작성하시오.
        `boolean` 타입의 변수를 선언하고, 그 변수를 `true` 로 초기화한 후 출력하는 프로그램을 작성하시오.
         */
        long a = 10000000000L;
        System.out.println(a);
        // sout + v 를 사용하면 가장 가까운 변수를 사용한다. 예) System.out.println("a = " + a);
        // 여기서 v 는 variable 를 의미함.

        boolean b;
        b = true;
        System.out.println(b);

    }
}
