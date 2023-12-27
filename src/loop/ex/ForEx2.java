package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        /*
        예제2. "짝수 출력"
        반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보시오. 이때, `num` 이라는 변수를 사용하여 수를 표현해야 한다.
        while문, for문 2가지 버전의 정답을 만들어야 한다.
         */

        /*
        for (int num = 2, count = 1; count<=10; num+=2, count++) {
            System.out.println(num);
        }
        */

        // 위 코드도 좋지만 아래 코드처럼 사용하는게 더 좋다.
        int num = 2;
        for (int count = 1; count <= 10; count++) { // 왜냐하면 여기 부분은 증감식이 되는 count 변수를 쓸 용도이다.
            System.out.println(num);
            num += 2;
        } // 그래서 이렇게 코드를 작성하는게 더 좋다.
        // 증감식이 되는 변수만 작성하면 졸음 -> 다른 용도까지 같이 사용하면 더 복잡해짐 -> 코드가 별로임 (물론 사람마다 의견은 다름!)
    }
}
