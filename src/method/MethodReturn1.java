package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    /*
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
        이 코드에서 `if` 조건이 만족할 때는 `true` 가 반환되지만, 조건을 만족하지 않은 경우에는 `return` 문이 실행되지 않는다.
        이 코드를 실행하면 `return` 문을 누락 했다는 [java: missing return statement] 컴파일 오류가 발생한다.
    }
    */
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    } // 이렇게 수정하면 `if` 조건을 만족하지 않아도 `else` 를 통해 `return` 문이 실행된다.

}
