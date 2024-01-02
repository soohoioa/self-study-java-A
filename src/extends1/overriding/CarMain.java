package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
// 실행 결과를 보면 `electricCar.move()` 를 호출했을 때 오버라이딩한 `ElectricCar.move()` 메서드가 실행된 것을 확인할 수 있다.