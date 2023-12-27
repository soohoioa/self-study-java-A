package cond;

public class If6 {
    public static void main(String[] args) {

        /*
        예제2. `if` 문을 사용해야 하는 곳에 `else if` 를 사용하면 문제가 발생한다.
         */

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");

        // 첫 번째로 충족되는 조건인 1000원 할인만 적용되고, `if` 문을 빠져나온다. 따라서 사용자는 나머지 할인을 놓치 게 된다.

        // 추가 : `if` 문 다음에 실행할 명령이 하나만 있을 경우에는 `{ }` 중괄호를 생략할수 있다. `elseif` , `else` 도 마찬가지이다.

        if (true)
            System.out.println("if문에서 실행됨");
        if (true)
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행 안됨");
        /*
        일반적으로는 `if` 문의 명령이 한개만 있을 경우에도 중괄호 를 사용하는 것이 좋다.

        가독성 : 중괄호를 사용하면 코드를 더 읽기 쉽게 만들어 준다. 조건문의 범위가 명확하게 표시되므로 코드의 흐름 을 더 쉽게 이해할 수 있다.
        유지보수성 : 중괄호를 사용하면 나중에 코드를 수정할 때 오류를 덜 발생시킬 수 있다. 예를 들어, `if` 문에 또 다른 코드를 추가 하려고 할때,
                  중괄호가 없으면 이 코드가 `if` 문 의 일부라는 것이 명확하지 않을 수 있다.
         */

    }
}

/*
정리
`if` 문을 각각 사용할지, `if` 와 `else if` 를 함께 묶어서 사용할지는 요구사항에 따라 다르다.
사용자의 요구사항에 따라 둘의 차이를 이해하고 적절하게 사용하면 된다.
 */
