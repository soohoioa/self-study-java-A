package static2;

public class DecoUtil1 {
    public String deco(String str) { // `deco()` 는 문자열을 꾸미는 기능을 제공한다. 문자열이 들어오면 앞 뒤에 `*` 을 붙여서 반환한다.
        String result = "*" + str + "*";
        return result;
    }
}
