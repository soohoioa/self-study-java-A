package static2;

public class DecoUtil2 {
    public static String deco(String str) { // 메서드 앞에 `static` 이 붙어있다. 이렇게 하면 정적 메서드를 만들 수 있다.
        // 이 정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스 명을 통해서 바로 호출할 수 있다.
        String result = "*" + str + "*";
        return result;
    }
}
