package loop;

public class While1_2 {
    public static void main(String[] args) {

        int count = 0;
        while (count < 3) {
            count++;
            System.out.println("현재 숫자는:" + count);
        }
        /*
        - `while (count < 3)` 에서 코드 블럭을 반복 실행한다. 여기서 `count` 의 값이 `1` ,`2` ,`3` 으로 점점 커지다가 결국 `count < 3` 이 거짓이 되면서 `while` 문을 빠져나간다.
        - `while(count < 3)` 에 있는 숫자를 `while(count < 100)` 으로 변경하면 `while` 문의 코드 블럭을 100번 반 복한다.
         */
    }
        /*
        while 문1
        while 문은 조건에 따라 코드를 반복해서 실행할 때 사용한다.
            <while 문>
            while (조건식) {
                // 코드
            }
        - 조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while 문을 벗어난다.
        - 조건식이 참이면 코드 블럭을 실행한다. 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사 한다.(무한 반복)

         */
}
