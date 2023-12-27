package cond;

public class If5 {
    public static void main(String[] args) {

        /*
        예제1. 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다. 각 각의 할인 조건은 다음과 같다
            - 아이템 가격이 10000원 이상일 때, 1000원 할인
            - 나이가 10살 이하일 때 1000원 할인
        이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있다는 점이다.
         */

        int prics = 10000;
        int age = 10;
        int discount = 0;

        if (prics >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        /*
        이 코드에서는 각각 독립된 `if` 문이 있다. 따라서 해당하는 모든 할인을 적용한다.

            <>
            예시1. if-else 사용: 서로 연관된 조건이어서, 하나로 묶을 때
            if (condition1) {
                // 작업1 수행
            else if (condition2) {
                // 작업2 수행
            }

            예시2.if 각각 사용: 독립 조건일 때
            if (condition1) {
                // 작업1 수행
            }
            if (condition2) {
                // 작업2 수행
            }
        `if` 문 에 여러조건이 있다고 항상 `if-else` 로 묶어서 사용할 수 있는것은 아니다.
        조건이 서로 영향을 주지 않고 각 각 수행해야 하는 경우에는 `else if` 문을 사용하면 안되고, 대신에 여러 `if` 문을 분리해서 사용해야 한다.
         */
    }
}
