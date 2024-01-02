package final1.ex;

public class Member {
    private final String id; //final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        //this.id = id; //컴파일 오류 발생
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }
}
/*
- `changeData()` 메서드에서 `final` 인 `id` 값 변경을 시도하면 컴파일 오류가 발생한다.
 */