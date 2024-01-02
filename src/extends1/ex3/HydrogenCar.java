package extends1.ex3;

public class HydrogenCar extends Car{
    public void fillHydrogen() {
        System.out.println("수소를 충전합니다.");
    }
}
/*
- 수소차를 추가했다.
- `Car` 를 상속받은 덕분에 `move()` , `openDoor()` 와 같은 기능을 바로 사용할 수 있다.
- 수소차는 전용 기능인 수소 충전( `fillHydrogen()` ) 기능을 제공한다.
 */
