package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a); // 출력값 : a = 10
        System.out.println("b = " + b); // 출력값 : b = 10

        // a 변경
        a = 20;
        System.out.println("변경 a = 20"); // a 의 값만 변경. a의 원래값이 10 이였는데 20 으로 변경함.
        System.out.println("a = " + a); // 출력값 : a = 20
        System.out.println("b = " + b); // 출력값 : b = 10

        // b 변경
        b = 30;
        System.out.println("변경 b = 30"); // a 는 위에서 20 으로 세팅했기에 20 이 출력되고, b 의 원래값이 10 이엿는데 30 으로 변경함.
        System.out.println("a = " + a); // 출력값 : a = 20
        System.out.println("b = " + b); // 출력값 : b = 30
    }
}
/*
여기서 핵심은 `int b = a` 라고 했을 때 변수에 들어있는 값을 복사해서 전달한다는 점이다.
따라서 `a=20` , `b=30` 이 라고 했을 때 각각 본인의 값만 변경되는 것을 확인할 수 있다.
 */
