package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성
        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) { // 배열의 인덱스는 0부터 시작하기 때문에 반복문에서 `i = 0` 을 초기값으로 사용
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        } // for 문의 조건이 `i < students.length` 이기 때문에 `i` 는 `0,1,2,3,4` 까지만 반복한다.
          // `i` 가 5가 되면 `5 < 5` 가 되면서 조건이 거짓이 되고, 반복을 종료한다.

        /*
        `students.length`
        - 배열의 길이를 제공하는 특별한 기능이다.
        - 참고로 이 값은 조회만 할 수 있다.
        - 대입은 할 수는 없다.
        - 현재 배열의 크기가 5이기 때문에 여기서는 5가 출력된다.
         */
    }
}
