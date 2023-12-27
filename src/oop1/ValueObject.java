package oop1;

public class ValueObject {
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가  value = " + value);
    } // 이 클래스에는 데이터인 `value` 와 해당 데이터를 사용하는 기능인 `add()` 메서드를 함께 정의했다.
}
