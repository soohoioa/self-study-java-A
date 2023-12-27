package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입한다.
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 2

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킨다.
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 1

        // 추가로 다음과 같이 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에, 본인의 값만 증가한다.
        // 따라서 전위이든 후위이든 둘다 결과가 같다.
        a++;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
    }
}
