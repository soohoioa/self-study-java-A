package method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
    }
    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}

/*
**자바에서는 함수를 메서드(Method)라 한다.**
메서드는 크게 메서드 선언과 메서드 본문으로 나눌 수 있다.

1. 메서드 선언(Method Declaration)
[ public static int add(int a, int b) ]
- 메서드의 선언 부분으로, 메서드 이름, 반환 타입, 매개변수(파라미터) 목록을 포함한다.
- 이름 그대로 이런 메서드가 있다고 선언하는 것이다. 메서드 선언 정보를 통해 다른 곳에서 해당 메서드를 호출할 수 있다.

2. 메서드 본문(Method Body)
[ System.out.println(a + "+" + b + " 연산 수행");
	int sum = a + b;
	return sum;
]
- 메서드가 수행해야 하는 코드 블록이다.
- 메서드를 호출하면 메서드 본문이 순서대로 실행된다.
- 메서드 본문은 블랙박스이다. 메서드를 호출하는 곳에서는 메서드 선언은 알지만 메서드 본문은 모른다.
- 메서드의 실행 결과를 반환하려면 return 문을 사용해야 한다. return 문 다음에 반환할 결과를 적어주면 된다.
- return sum : sum 변수에 들어있는 값을 반환한다.


**인수(Argument)** 전달하는 수 로 생각하면 될듯하다.
- 여기서 "hello" , 20 처럼 넘기는 값을 영어로 Argument(아규먼트), 한글로 인수 또는 인자라 한다.
- 실무에서는 아규먼트, 인수, 인자라는 용어를 모두 사용한다.
- 인수 라는 용어는 메서드 내부로 들어가는 값을 의미 한다. 인자도 같은 의미이다.

**매개변수(Parameter)**
- 메서드를 정의할 때 선언한 변수인 String str , int age 를 매개변수, 파라미터라 한다.
- 메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
- 실무에서는 매개변수, 파라미터 용어를 모두 사용한다.
- 매개변수, parameter는 메서드 호출부와 메서드 내부 사이에서 값을 전달하는 역할을 하는 변수라는 뜻이다.
 */