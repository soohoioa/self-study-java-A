package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum); break;
            }
            i++;
        }
    }
}
/*
`for (; ; )` 를 보면 조건식이 없다. `for`문은 조건이 없으면 무한 반복한다.
`sum > 10` 조건을 만족하면 `break` 를 사용해서 `while`문을 빠져나간다.

`for`문은 증가하는 값이 무엇인지 초기식과 증감식을 통해서 쉽게 확인할 수 있다.
이 코드나 `while`문을 보면 어떤 값이 반복에 사용되는 증가 값인지 즉시 확인하기는 어렵다.

여기서는 `i` 가 증가하는 값이다. 따라서 다음과 같이 `i` 를 `for` 문에 넣어서 관리하도록 변경하면 더 깔끔한 코드가 된 다
 */
