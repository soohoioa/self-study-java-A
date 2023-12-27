package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // 인스턴스를 생성하고 즉시 해당 생성자를 호출한다.
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        /*
        생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
        생성자를 호출하는 방법은 `new` 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.
         */

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
    /*
    참고로 `new` 키워드를 사용해서 객체를 생성할 때 마지막에 괄호 `()` 도 포함해야 하는 이유가 바로 생성자 때문이다.
    객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함한다.
     */
}
