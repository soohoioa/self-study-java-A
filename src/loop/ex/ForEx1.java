package loop.ex;

public class ForEx1 {
    public static void main(String[] args) {

        /*
        예제1. "자연수 출력"
        처음 10개의 자연수를 출력하는 프로그램을 작성하시오. 이때, `count` 라는 변수를 사용해야 한다.
        while문, for문 2가지 버전의 정답을 만들어야 한다.
         */

        int count = 1;
        for (count = 1; count <=10; count++) {
            System.out.println(count);
        }
    }
}
