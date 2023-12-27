package cond;

public class If4 {
    public static void main(String[] args) {

        int age = 14;

        if(age <= 7) { // ~7: 미취학
            System.out.println("미취학");
        } else if(age <= 13) { // 8~13: 초등학생
            System.out.println("초등학생");
        } else if(age <= 16) { // 14~16: 중학생
            System.out.println("중학생");
        } else if(age <= 19) { // 17~19: 고등학생
            System.out.println("고등학생");
        } else { //2 0~: 성인
            System.out.println("성인");
        }

        /*
        else-if 문은 앞선 if 문의 조건이 거짓일 때 다음 조건을 검사한다. 만약 앞선 if 문이 참 이라면 else-if 를 실행 하지 않는다.

            <else - if>
            if (condition1) {
                // 조건1이 참일 때 실행되는 코드
            } else if (condition2) {
                // 조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
            } else if (condition3) {
                // 조건2이 거짓이고, 조건3이 참일 때 실행되는 코드
            } else {
                // 모든 조건이 거짓일 때 실행되는 코드
            }

        쉽게 이야기해서 이렇게 전체 if문을 하나로 묶는다고 보면 된다. 이렇게 하면 특정 조건이 만족하면 해당 코드를 실행하고 if 문 전체를 빠져나온다.
        특정 조건을 만족하지 않으면 다음 조건을 검사한다. 여기서 핵심은 순서대로 맞는 조건 을 찾아보고, 맞는 조건이 있으면 딱 1개만 실행이 되는 것이다.

        참고로 else 는 생략이 가능하다.

            <else 생략 코드>
            if (condition1) {
                // 조건1이 참일 때 실행되는 코드
            } else if (condition2) {
                // 조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
            }

         */

    }
}
