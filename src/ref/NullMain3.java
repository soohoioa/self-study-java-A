package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        // 단축키 : 줄 변경 option + shift + 위 아래 방향키

        System.out.println("bigData.data.value = " + bigData.data.value);
        /*
        bigData.data.value // 코드를 풀어서 해석해보면
        x001.data.value // bigData 는 x001 참조값을 가진다.
        null.value // x001.data 는 null 값을 가진다.
        NullPointerException // null 값에 .(dot)을 찍으면 예외가 발생한다.
         */
    }
}
