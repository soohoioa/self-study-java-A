package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 7.5; // 실수
        boolean c = true; // true, false 만 입력가능. 주로 참, 거짓을 판단하는 곳에서 사용한다.
        char d ='A'; // 문자 하나를 다룰때 사용하며 ' ' 를 사용해서 감싸준다.
        String e = "Hello Java"; // 문자열을 다루기 위한 특별한 타입. " " 를 사용해서 감싸준다.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        /*
        변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재하고, 이러한 형식을 영어로는 타입(Type) 이라 한다.
        각 변수는 지정한 타입에 맞는 값을 사용해야 한다.

        리터럴(literal)이라는 단어의 어원이 문자 또는 글자를 의미한다.
        직접 적은 `100` , `7.5` , `true` , `'A'` , `"Hello Java"` 와 같은 고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.

        변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.
         */
    }
}
