package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        /*
        예제3. 배열과 역순 출력
        사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
        출력시 출력포멧은 5,4,3,2,1 과 같이 `,` 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
         */

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) { // numbers.length : 배열의 길이만큼 입력을 받는다.
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) { // 인덱스가 0이면 if 문을 탈출한다.
                System.out.print(", ");
            }
        }
    }
}
