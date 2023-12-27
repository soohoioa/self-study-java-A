package scope;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); //longValue = 10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = " + doubleValue); //doubleValue1 = 10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); //doubleValue2 = 20.0

        doubleValue = intValue;
        doubleValue = (double) intValue; //형 맞추기
        doubleValue = (double) 10; //변수 값 읽기
        doubleValue = 10.0; //형변환
        /*
        이렇게 앞에 `(double)` 과 같이 적어주면 `int` 형이 `double` 형으로 형이 변한다. 이렇게 형이 변경되는 것을 형변환 이라 한다.
        작은 범위 숫자 타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 이렇게 직접 형변환을 하지 않아도 된다.
        이런 과정이 자동으로 일어나기 때문에 **자동 형변환**, 또는 **묵시적 형변환**이라 한다.
         */
    }
    /*
    자바는 기본적으로 같은 타입에 값을 대입할 수 있다.
    - `int` -> `long` 을 비교해 보면 `long` 이 `int` 보다 더 큰 숫자 범위를 표현한다.
    작은 범위 숫자 타입에서 큰범위 숫자 타입에 대입을 하면 문제가 되지 않는다. 만약 이런 경우까지 오류가 발생한다면 개발이 너무 불편할 것이다.
    - `long` ->  `double` 의 경우에도 `double` 은 부동 소수점을 사용하기 때문에 더 큰 숫자 범위를 표현한다. 따라서 대입할 수 있다.
    - 정리하면 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용한다. 쉽게 이야기하면 큰 그릇은 작은 그릇에 담 긴 내용물을 담을 수 있다.
     */
}
