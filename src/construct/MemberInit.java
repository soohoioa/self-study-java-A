package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        // 내가 가지고 있는 멤버변수의 값을 넣어주고 싶다.
        // -> name 을 넣어주고 싶은데 MemberInit class 의 name 과 void initMember Method 의 name 이 동일하다.
        // -> 이러면 어떤 name 인지 모르니까 본인이 가까운 스콥이 우선순위를 가진다. 나는 MemberInit 의 name 을 사용하고 싶다면 this 를 사용한다.
        this.age = age; // this 를 사용하면 자기 자신의 인스턴스를 가르킨다.
        this.grade = grade;
    }
}
