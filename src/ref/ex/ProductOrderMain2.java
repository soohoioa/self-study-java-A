package ref.ex;



public class ProductOrderMain2 {
    public static void main(String[] args) {
        /*
        예제1. 상품 주문 시스템 개발 - 리팩토링
        1. ₩ProductOrder` 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
            - 상품명 (`productName`), 가격 (`price`), 주문 수량 (`quantity`)
        2. 다음으로 `ref.ex.ProductOrderMain2` 클래스 안에 `main()` 메서드를 포함하여, 여러 상품의 주문 정보를 배열 로 관리하고, 그 정보들을 출력하고,
        최종 결제 금액을 계산하여 출력하자. 이 클래스에서는 다음과 같은 메서드를 포함해야 한다.
            - `ProductOrder` 를 생성하고 매개변수로 초기값을 설정한다. 마지막으로 생성한 `ProductOrder` 를 반환한다.
                (static ProductOrder createOrder(String productName, int price, int quantity))
            - 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 상품명, 가격, 수량을 출력한다.
                (static void printOrders(ProductOrder[] orders))
            - 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 총 결제 금액을 계산하고, 계산 결과를 반환한다.
                (static int getTotalAmount(ProductOrder[] orders))
         */

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        // 단축키 - option + command + V
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
        // iter 단축키
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}
