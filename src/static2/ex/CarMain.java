package static2.ex;

public class CarMain {
    /*
    에제1. 구매한 자동차 수
    - 다음 코드를 참고해서 생성한 차량 수를 출력하는 프로그램을 작성하자.
    - `Car` 클래스를 작성하자.
     */

    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");
        Car.showTotalCars(); //구매한 차량 수를 출력하는 static 메서드
    }

}
