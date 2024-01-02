package extends1.ex2;

public class ElectricCar extends Car{
    public void charge() {
        System.out.println("충전합니다.");
    }
}
/*
- 전기차는 `extends Car` 를 사용해서 부모 클래스인 `Car` 를 상속 받는다.
- 상속 덕분에 `ElectricCar` 에서도 `move()` 를 사용할 수 있다.
 */