package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        /*
        예제1. "이름 나이 입력받고 출력하기"
        이름과 나이를 출력하시오.
        출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다." 이어야 한다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요. : ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요. : ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
    }
}
