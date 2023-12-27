package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {

        /*
        예제6. "사이 숫자"
        두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하시오.
        첫 번째 숫자 변수의 이름은 num1 이다.
        두 번째 숫자 변수의 이름은 num2 이다.
        만약 첫 번째 숫자 num1 이 두 번째 숫자 num2 보다 크다면, 두 숫자를 교환하시오.
            - 참고: 교환을 위해 임시 변수 사용을 고려
        num1 부터 num2 까지의 각 숫자를 출력하시오.
        출력시 " , " 로 구분헤서 출력하시오.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            temp = num2;
        }

        System.out.print("두 숫자 사이의 모든 정수 : ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) { // i 가 마지막에 온 값이 아니면 ' , ' 를 출력하고, i 가 마지막에 온 값이면 ' , ' 는 출력하지 않는다.
                System.out.print(",");
            }
        }

    }
}
