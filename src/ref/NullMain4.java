package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        // 단축키 : 줄 변경 option + shift + 위 아래 방향키

        System.out.println("bigData.data.value = " + bigData.data.value);
        /*
        bigData.data.value // 코드를 풀어서 해석해보면
        x001.data.value // bigData 는 x001 참조값을 가진다.
        x002.value // x001.data 는 x002 값을 가진다.
        0 // 최종 결과
         */
    }
}
