package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); // double 을 int 형에 대입하므로 컴파일 오류
        // java: incompatible types: possible lossy conversion from double to int
        printNumber((int) number); // 명시적 형변환을 사용해 double 을 int 로 변환
    }
    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }

}
