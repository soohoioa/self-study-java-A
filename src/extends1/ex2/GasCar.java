package extends1.ex2;

public class GasCar extends Car{
    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
/*
- 가솔린차도 전기차와 마찬가지로 `extends Car` 를 사용해서 부모 클래스인 `Car` 를 상속 받는다.
- 상속 덕분에 여기서도 `move()` 를 사용할 수 있다.
 */