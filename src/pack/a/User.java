package pack.a;

public class User {
    public User() {
        System.out.println("패키지 pack.a 회원 생성");
    }
    /*
    `pack` 하위에 `a` 라는 패키지를 먼저 만들자.
    `pack.a` 패키지에 `User` 클래스를 만들었다.
    이후에 `User` 인스턴스가 생성되면 생성자를 통해 정보를 출력한다.
     */
} // **참고**: 생성자에 `public` 을 사용했다. 다른 패키지에서 이 클래스의 생성자를 호출하려면 `public` 을 사용해야 한다.
