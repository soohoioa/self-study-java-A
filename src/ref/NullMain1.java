package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조형 변수 Data 를 만들고 여기에 null 값을 할당했다. 따라서 data 변수에는 아직 가리키는 객체가 없다는 뜻이다.
        System.out.println("1. data = " + data); // 1. data = null
        data = new Data(); // 새로운 Data 객체를 생성해서 그 참조값을 Data 변수에 할당했다. 이제 data 변수가 참조할 객체가 존재한다.
        // Data 에는 value 가 있고 0으로 초가화 된다.
        System.out.println("2. data = " + data); // 2. data = ref.Data@30f39991
        data = null; // data 에 다시 null 값을 할당하면 data 변수는 앞서 만든 Data 인스턴스를 더는 참조하지 않는다.
        System.out.println("3. data = " + data); // 3. data = null
    }
}
