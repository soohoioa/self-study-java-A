package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {

        /*
        예제10. "상품 구매"
        상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하시오. 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있다.
        다음 세 가지 옵션을 제공해야 한다 (1: 상품 입력, 2: 결제, 3: 프로그램 종료). 옵션은 정수로 입력받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
        상품 입력 옵션을 선택하면, 상품명과 가격, 수량을 입력받으시오.
        결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 `0` 으로 초기화하시오.
        (사용자가 총 비용을 확인하고, 결제를 완료했다고 가정한다. 따라서 다음 사용자를 위해 총 비용을 다시 `0` 으로 초기화 해야합니다.)
        프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하시오.
        위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하시오.
         */

        Scanner input = new Scanner(System.in);
        int totalCost = 0; // 전체 상품의 가격이 누적되다가 결제할때 출력.

        while (true) {
            System.out.println("1. 상품입력, 2. 결제, 3. 프로그램 종료");
            int option = input.nextInt(); // 몇번 옵션을 선택했는지 계속 받음.

            if (option == 1) {
                input.nextLine(); // 이전에 입력된 개행문자 제거. 숫자만 가져가고 enter 가 안됨 -> 그래서 작성해줘야 함.

                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명 : " + product + " 가격 : " + price + " 수량 : " + quantity + " 합계 : " + price + quantity);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0; // 결제 후 총 비용 초기화

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
