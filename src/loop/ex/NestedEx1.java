package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {

        /*
        예제4. "구구단 출력"
        중첩 for문을 사용해서 구구단을 완성해라.
         */

        int i = 2;
        int j = 1;
        for (i = 2; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }

    }
}
