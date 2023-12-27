package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화
        /*
        한줄로도 코드가 가능하다.
        int[] students = new int[]{90, 80, 70, 60, 50}; //배열 변수 선언, 배열 생성과 초기화

        더 간단하게도 가능하다. 배열은 `{}` 만 사용해서 생성과 동시에 편리하게 초기화 하는 기능을 제공한다.
        int[] students = {90, 80, 70, 60, 50};

        오류! 이렇게 하면 자바가 배열인지 아닌지 모르기 때문에 에러가 발생한다.
        int[] students;
        students = {90, 80, 70, 60, 50};
         */

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
