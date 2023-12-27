package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        /*
        예제9. "입력한 숫자의 합계와 평균"
        여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하시오.
        숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정한다.
        모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum 과 평균 average 를 출력하고, 평균은 소수점 아래까지 계산해야 한다.
         */

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.print("숫자를 입력하세요. 입력을 중단 하려면 -1 을 입력하세요. : ");

        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++; // 평균을 구하기 위해서 몇개인지 알아야 함.
        }

        /*
        아래 코드처럼 축약이 가능함.
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
         */

        double average = (double) sum / count; // int 와 int 의 계산이라 (double) 를 작성 안하면 소수점이 모두 날라감.
        System.out.println("입력한 숫자들의 합 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}
/*
반복문 실행
while ((input = scanner.nextInt()) != -1) //사용자 3입력
while ((input = 3) != -1) //input 에 3 대입
while ((input(3)) != -1) //input 의 값 읽기
while ((3) != -1) //() 제거
while (3 != -1) // 부등식 연산
while (true) //while 문 실행

반복문 종료
while ((input = scanner.nextInt()) != -1) //사용자 -1입력
while ((input = -1) != -1) //input 에 -1 대입
while ((input(-1)) != -1) //input 의 값 읽기
while ((-1) != -1) //() 제거
while (-1 != -1) // 부등식 연산
while (false) //while 문 종료
 */