package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // 중간에 break 문을 만나기 전까지 무한 반복한다.
            System.out.print("문자열을 입력하세요.(exit : 종료): ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } // 입력 받은 문자가 "exit" 이면 "프로그램을 종료합니다."를 출력하고 break 문을 통해서 while 문을 빠져나간다.
            System.out.println("입력한 문자열 : " + str);
        }
    }
}
