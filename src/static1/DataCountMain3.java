package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
        // `Data3.count` 와 같이 클래스명에 `.` (dot)을 사용 한다. 마치 클래스에 직접 접근하는 것 처럼 느껴진다.

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        //클래스를 통합 접근
        System.out.println(Data3.count);
    }
}
