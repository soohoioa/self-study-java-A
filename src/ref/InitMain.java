package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // value1 은 초기값을 지정하지 않았지만 멤버변수는 자동으로 초기화 되서 숫자는 0으로 초가화된다.
        System.out.println("value2 = " + data.value2); // value2 는 10으로 초기값을 지정해두었기에 객체를 생성할때 10으로 초가화 된다.
    }
}
