package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작 (main 안에서 선언 되었기에 main을 종료하면 없어짐.)
        if (true) {
            int x = 20; //x 생존 시작 (if문 안에서 선언되었기에 if문을 나가면 없어짐.)
            System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x);
        } //x 생존 종료

        // System.out.println("main x = " + x); //컴파일 오류 발생, 변수 x에 접근 불가, Cannot resolve symbol 'x'
        System.out.println("main m = " + m);
    } //m 생존 종료
}
/*
`int m`
    - `int m` 은 `main{}` 의 코드 블록안에서 선언되었다. 따라서 변수를 선언한 시점부터 `main{}` 의 코드 블 록이 종료될 때 까지 생존한다.
    - `if{}` 블록 내부에서도 외부 블록에서 선언된 `m` 에 접근할 수 있다. 쉽게 이야기해서 생존 범위만 맞으면 다 접근할 수 있다.

`int x`
    - `int x` 는 `if{}` 블록안에서 선언되었다. 따라서 변수를 선언한 시점부터 `if{}` 의 코드 블록이 종료될 때 까지 생존한다.
    - `if{}` 내부에서는 자신의 범위에서 선언한 `x` 에 당연히 접근할 수 있다.
    - `if{}` 코드 블록이 끝나버리면 `x` 는 제거된다. 따라서 더는 `x` 에 접근할 수 없다. 따라서 이후에 접근하면 `cannot find symbol` 이라는 변수 이름을 찾을 수 없다는 컴파일 오류가 발생한다.

정리하면 지역 변수는 본인의 코드 블록 안에서만 생존한다.
그리고 자신의 코드 블록 안에서는 얼마든지 접근할 수 있다.
하지만 자신의 코드 블록을 벗어나면 제거되기 때문에 접근할 수 없다.

**이렇게 변수의 접근 가능한 범위를 스코프(Scope)라 한다. 참고로 `Scope`를 번역하면 범위라는 뜻이다.**
`int m` 은 `main{}` 전체에서 접근할 수 있기 때문에 스코프가 넓고, `int x` 는 `if{}` 코드 블록 안에서만 접근할 수 있기 때문에 스코프가 좁다.
 */
