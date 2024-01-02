package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}

/*
- 전기차( `ElectricCar` )와 가솔린차( `GasCar` )를 만들었다.
- 전기차는 이동( `move()` ), 충전( `charge()` ) 기능이 있 고, 가솔린차는 이동( `move()` ), 주유( `fillUp()` ) 기능이 있다.

- 전기차와 가솔린차는 자동차( `Car` )의 좀 더 구체적인 개념이다.
- 반대로 자동차( `Car` )는 전기차와 가솔린차를 포함하는 추상적인 개념이다.
- 그래서인지 잘 보면 둘의 공통 기능이 보인다. 바로 이동( `move()` )이다.
- 전기차든 가솔린차든 주유하는 방식이 다른 것이지 이동하는 것은 똑같다.

이런 경우 상속 관계를 사용하는 것이 효과적 이다.
 */
