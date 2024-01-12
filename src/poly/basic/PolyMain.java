package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.

        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

    }
}
/*
>
**부모 타입의 변수가 부모 인스턴스 참조**
`Parent Parent: parent.parentMethod()`
- 부모 타입의 변수가 부모 인스턴스를 참조한다.
- `Parent parent = new Parent()`
- `Parent` 인스턴스를 만들었다.
  - 이 경우 부모 타입인 `Parent` 를 생성했기 때문에 메모리 상에 `Parent` 만 생성된다.(자식은 생성되지 않는다.)
- 생성된 참조값을 `Parent` 타입의 변수인 `parent` 에 담아둔다.
- `parent.parentMethod()` 를 호출하면 인스턴스의 `Parent` 클래스에 있는 `parentMethod()` 가 호출된다.

>
**자식 타입의 변수가 자식 인스턴스 참조**
`Child Child: child.childMethod()`
- 자식 타입의 변수가 자식 인스턴스를 참조한다.
- `Child child = new Child()`
- `Child` 인스턴스를 만들었다.
  - 이 경우 자식 타입인 `Child` 를 생성했기 때문에 메모리 상에 `Child` 와 `Parent` 가 모두 생성된다.
- 생성된 참조값을 `Child` 타입의 변수인 `child` 에 담아둔다.
- `child.childMethod()` 를 호출하면 인스턴스의 `Child` 클래스에 있는 `childMethod()` 가 호출된다.

>
**다형적 참조: 부모 타입의 변수가 자식 인스턴스 참조**
`Parent Child: poly.parentMethod()`
- 부모 타입의 변수가 자식 인스턴스를 참조한다.
- `Parent poly = new Child()`
- `Child` 인스턴스를 만들었다.
  - 이 경우 자식 타입인 `Child` 를 생성했기 때문에 메모리 상에 `Child` 와 `Parent` 가 모두 생성된다.
- 생성된 참조값을 `Parent` 타입의 변수인 `poly` 에 담아둔다.

>
**부모는 자식을 담을 수 있다.**
- 부모 타입은 자식 타입을 담을 수 있다.
- `Parent poly` 는 부모 타입이다.
  - `new Child()` 를 통해 생성된 결과는 `Child` 타입이다.
  - 자바에서 부모 타입은 자식 타입을 담을 수 있다!
  - `Parent poly = new Child()` : 성공
- 반대로 자식 타입은 부모 타입을 담을 수 없다.
  - `Child child1 = new Parent()` : 컴파일 오류 발생

- 항상 같은 타입에 참조를 대입했다. 그래서 보통 한 가지 형태만 참조할 수 있다.
  - `Parent parent = new Parent()`
  - `Child child = new Child()`

- 그런데 `Parent` 타입의 변수는 다음과 같이 자신인 `Parent` 는 물론이고, 자식 타입까지 참조할 수 있다. 만약 손자가 있다면 손자도 그 하위 타입도 참조할 수 있다.
  - `Parent poly = new Parent()`
  - `Parent poly = new Child()`
  - `Parent poly = new Grandson()` : `Child` 하위에 손자가 있다면 가능

자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
이것이 바로 다양한 형태를 참조할 수 있다고 해서 다형적 참조라 한다.
 */
