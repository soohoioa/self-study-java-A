package loop;

public class While2_3 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int endNum = 3;
        /*
        sum = sum + i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
         */

        // 위 코드를 수정해주면 아래와 같다.
        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
        /*
        반복 횟수 정하기
        `i` 가 `endNum` 이 될때 까지 반복해서 코드를 실행하면 된다.
            - `i=1` , `endNum=3` 이라면 3번 반복하면 된다. `i=1 -> 2 -> 3
            - i=3` , `endNum=4` 라면 2번 반복하면 된다. `i=3 -> 4
        while 문 작성하기
            - `while` 문에서 `i <= endNum` 조건을 통해 `i` 가 `endNum` 이 될 때 까지 코드 블럭을 실행한다.
            - `i` 가 `endNum` 보다 크면 `while` 문을 종료한다.
         */
}
