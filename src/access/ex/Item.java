package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getTotalPrice() {
        return price * quantity;
    }
}
/*
각각의 `Item` 의 가격과 수량을 곱하면 각 상품별 합계를 구할 수 있다.
`price` 와 `quantity` 를 외부에 반환한 다음 에 외부에서 곱해서 상품별 합계를 구해도 되지만,
`getTotalPrice()` 메서드를 제공하면 외부에서는 단순히 이 메서드를 호출하면 된다.
이 메서드의 핵심은 자신이 가진 데이터를 사용한다는 점이다.
 */