package operator.ex;

public class OperationEx3 {
    public static void main(String[] args) {

        /*
        문제3. 합격범위

        1. `int` 형 변수 `score` 를 선언하시오.
        2. score` 가 80점 이상이고, 100점 이하이면 `true` 를 출력하고, 아니면 `false` 를 출력하시오.
         */

        int score = 80;
        System.out.println(score >= 80 && score <= 100); // true

        boolean result = score >= 80 && score <= 100;
        System.out.println(result); // true
    }
}
