package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); // 라인 구분을 위해 실행
        }
        /*
        결과값
        외부 for 시작 i:0
        -> 내부 for 0-0
        -> 내부 for 0-1
        -> 내부 for 0-2
        외부 for 종료 i:0

        외부 for 시작 i:1
        -> 내부 for 1-0
        -> 내부 for 1-1
        -> 내부 for 1-2
        외부 for 종료 i:1
         */
    }
}
/*
외부 `for`는 2번, 내부 `for`는 3번 실행된다.
그런데 외부 `for` 1번당 내부 `for`가 3번 실행되기 때문에 외부(2) * 내부(3) 해서 총 6번의 내부 `for` 코드가 수행된다.
 */
