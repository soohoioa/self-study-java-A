package cond;

public class If2 {
    public static void main(String[] args) {

        int age = 20; // 사용자 나이

        if (age >= 18) {
            System.out.println("성인입니다."); // 참일때 실행된다.
        } else {
            System.out.println("미성년자입니다."); // 만족하는 조건이 없을때 실행된다.
        }

        /*
        else 문은 if 문에서 만족하는 조건이 없을 때 실행하는 코드를 제공한다.

            <else>
            if (condition) {
                // 조건이 참일 때 실행되는 코드
            } else {
                // 만족하는 조건이 없을 때 실행되는 코드
            }

         */

    }
}
