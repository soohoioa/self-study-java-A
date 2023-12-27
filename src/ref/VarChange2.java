package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // A의 참조값만 읽어서 B에 들어간다.

        System.out.println("dataA 참조값 = " + dataA); // dataA 주소값 은 dataB 주소값 과 동일하다.
        System.out.println("dataB 참조값 = " + dataB); // dataB 주소값 은 dataA 주소값 과 동일하다.
        System.out.println("dataA.value = " + dataA.value); // 출력값 : dataA.value = 10
        System.out.println("dataB.value = " + dataB.value); // 출력값 : dataB.value = 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 출력값 : dataA.value = 20
        System.out.println("dataB.value = " + dataB.value); // 출력값 : dataB.value = 20

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 출력값 : dataA.value = 30
        System.out.println("dataB.value = " + dataB.value); // 출력값 : dataB.value = 30
    }
}
