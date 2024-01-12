package static2;

// import static static2.DecoData.staticCall; 특정 클래스의 정적 메서드 하나만 적용하려면 다음과 같이 생략할 메서드 명을 적어주면 된다.
// import static static2.DecoData.*; 특정 클래스의 모든 정적 메서드에 적용하려면 다음과 같이 `*` 을 사용하면 된다.
public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();
        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
