package scope;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); //1
        /*
        int div1 = 3 / 2; // int / int
        int div1 = 1; // int / int 이므로 int 타입으로 결과가 나온다.
         */

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); //1.0
        /*
        double div2 = 3 / 2; //int / int
        double div2 = 1; //int / int 이므로 int 타입으로 결과가 나온다.
        double div2 = (double) 1; //int -> double 에 대입해야 한다. 자동 형변환 발생
        double div2 = 1.0; // 1(int) -> 1.0(double)로 형변환 되었다.
         */

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5
        /*
        double div3 = 3.0 / 2; //double / int
        double div3 = 3.0 / (double) 2; // double / int 이므로, double / double 로 형변환이 발생한다.
        double div3 = 3.0 / 2.0; //double / double -> double 이 된다.
        double div3 = 1.5;
         */

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); //1.5
        /*
        double div4 = (double) 3 / 2; //명시적 형변환을 사용했다. (double) int / int
        double div4 = (double) 3 / (double) 2; // double / int 이므로, double / double 로 형변환이 발생한다.
        double div4 = 3.0 / 2.0; // double / double -> double이 된다.
        double div4 = 1.5;
         */

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5
        /*
        double result = (double) a / b; // (double) int / int
        double result = (double) 3 / 2; // 변수 값 읽기
        double result = (double) 3 / (double) 2; // double + int 이므로 더 큰 범위로 형변환
        double result = 3.0 / 2.0; // (double / double) -> double 이 된다.
        double result = 1.5;
         */
    }
}
/*
자바에서 계산은 다음 2가지를 기억하자.
1. **같은 타입끼리의 계산은 같은 타입의 결과를 낸다.**
`int` + `int` 는 `int` 를, `double` + `double` 은 `double` 의 결과가 나온다.
2. **서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.**
`int` + `long` 은 `long` + `long` 으로 자동 형변환이 일어난다.
`int` + `double` 은 `double` + `double` 로 자동 형변환이 일어난다.

다양한 타입별로 더 자세히 들어가면 약간 차이가 있지만 이 기준으로 이해하면 충분하다.
*/