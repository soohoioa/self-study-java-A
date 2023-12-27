package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String 으로 가져온다.
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt(); // 입력을 int 로 가져온다.
        System.out.println("입력한 정수 : " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble(); // 입력을 double 로 가져온다.
        System.out.println("입력한 실수 : " + doubleValue);

        /*
        **주의!** - 타입이 다르면 오류가 발생한다.

        문자열을 입력하세요:java
        입력한 문자열 : java
        정수를 입력하세요:10.5
        Exception in thread "main" java.util.InputMismatchException
	        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
	        at java.base/java.util.Scanner.next(Scanner.java:1602)
	        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
	        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
	        at scanner.Scanner1.main(Scanner1.java:14)
	    라는 에러가 발생한다.

         */
    }
}
