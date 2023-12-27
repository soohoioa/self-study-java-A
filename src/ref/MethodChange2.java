package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 출력값 : 메서드 호출 전: dataA.value = 10
        System.out.println("dataA = " + dataA); // dataA 주소값 은 dataX 주소값 과 동일하다.
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 출력값 : 메서드 호출 후: dataA.value = 20
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX); // dataX 주소값 은 dataA 주소값 과 동일하다.
        dataX.value = 20;
    }
}
