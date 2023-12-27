package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {

        /*
        예제4. "구구단 출력"
        하나의 정수 n 을 입력받고, 입력받은 정수 n 의 구구단을 출력하는 프로그램을 작성하시오.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수 입력 : ");
        int number = scanner.nextInt();

        System.out.println(number + " 단의 구구단 : ");

        for (int i = 1; i < 10; i++ ) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }

}
