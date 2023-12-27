package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        // 예외가 발생하면 코드를 끝까지 수행하지 않고 예외가 발생한 코드까지 출력되고 나머지 로직은 수행이 안된다. 바로 밖으로 빠져 나온다.
        System.out.println("data = " + data.value);
    }
}
/*
객체를 참조할 때는 `.`(dot)을 사용한다.
이렇게 하면 참조값을 사용해서 해당 객체를 찾아갈 수 있다.
그런데 참조값이 `null`이라면 값이 없다는 뜻이므로, 찾아갈 수 있는 객체(인스턴스)가 없다.
`NullPointerException`은 이처럼 `null`에 `.`(dot)을 찍었을 때 발생한다.
 */