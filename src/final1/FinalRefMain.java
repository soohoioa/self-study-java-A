package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형 변수 `data` 에 `final` 이 붙었다.
        // 변수 선언 시점에 참조값을 할당했으므로 더는 참조값을 변경할 수 없다.
        //data = new Data(); //final 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        /*
        그런데 참조 대상의 객체 값은 변경할 수 있다.
        - 참조형 변수 `data` 에 `final` 이 붙었다.
          - 이 경우 참조형 변수에 들어있는 참조값을 다른 값으로 변경하지 못한다. -> 이제 다른 객체를 참조할 수 없다.
          - 참조형 변수 에 들어있는 참조값만 변경하지 못한다는 뜻이다. 이 변수 이외에 다른 곳에 영향을 주는 것이 아니다.
        - `Data.value` 는 `final` 이 아니다. 따라서 값을 변경할 수 있다.
         */
    }
} // 참조형 변수에 `final` 이 붙으면 참조 대상을 자체를 다른 대상으로 변경하지 못하는 것이지, 참조하는 대상 의 값은 변경할 수 있다.
