package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {

        /*
        예제3. "음식점 주문"
        음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity)을 입력받아, 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하시오.
        음식의 총 가격을 계산하시오. 총 가격은 각 음식의 가격(foodPrice)과 수량(foodQuantity)을 곱한 값이며, 이를 totalPrice 라는 이름의 변수에 저장하시오.
        주문 정보와 총 가격을 출력하시오. 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]원 입니다." 이어야 한다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름 입력 : ");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격 입력 : ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식 수량 입력 : ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + foodQuantity + " 개 를 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");

    }
}
