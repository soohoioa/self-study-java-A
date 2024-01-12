package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // `static` 이 붙은 정적 메서드는 객체 생성 없이 클래스명 +  `.` (dot) + 메서드명으로 바로 호출할 수 있다.

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
} // 정적 메서드 덕분에 불필요한 객체 생성 없이 편리하게 메서드를 사용했다.

