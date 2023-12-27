package loop;

public class While1_1 {
    public static void main(String[] args) {

        int count = 0;
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);

        //개선
        count++;
        System.out.println("현재 숫자는 : " + count);
        count++;
        System.out.println("현재 숫자는 : " + count);
        count++;
        System.out.println("현재 숫자는 : " + count);
    } // 특정 코드를 반복해서 실행할 때 사용하는 것이 바로 반복문이다.
}
