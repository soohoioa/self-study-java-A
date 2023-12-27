package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {

        AccessData data = new AccessData(); //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();
        // `AccessInnerMain` 은 `AccessData` 와 같은 패키지이다. 따라서 `default` 접근 제어자에 접근할 수 있다.

        //private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();
        data.innerAccess();
    }
}
