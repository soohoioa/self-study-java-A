package cond;

public class If3 {
    public static void main(String[] args) {

        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if(age >= 8 && age <= 13) { //8~13: 초등학생
            System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        }
        if(age >= 17 && age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        }
        if(age >= 20) { //20~: 성인
            System.out.println("성인");
        }
        /*
        불필요한 조건 검사: 이미 조건을 만족해도 불필요한 다음 조건을 계속 검사한다. (나머지 `if` 문을 통한 조건 검사도 모두 실행해야 한다.)
        코드 효율성: 여기서 age >= 8 이라는 조건은 이미 앞의 age <= 7 이라는 조건과 관련이 있다. 결과적으로 조건을 중복 체크한 것이다.
         */

        // 이런 코드에 `else if` 를 사용하면 불필요한 조건 검사를 피하고 코드의 효율성을 향상시킬 수 있다.
    }
}
