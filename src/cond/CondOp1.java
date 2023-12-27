package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인"; } else {
            status = "미성년자"; }
        System.out.println("age = " + age + " status = " + status);
        // 참과 거짓에 따라 `status` 변수의 값이 달라진다.
    }
    // 이렇게 단순히 참과 거짓에 따라서 특정 값을 구하는 경우 **삼항 연산자** 또는 **조건 연산자**라고 불리는 `?:` 연산자를 사용 할 수 있다.
    //이 연산자를 사용하면 `if` 문과 비교해서 코드를 단순화 할 수 있다.
}
