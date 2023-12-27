package pack;

import pack.a.User;
//  import pack.a.*; //pack.a의 모든 클래스 사용
public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지 명 생략 가능
    }
    /*
    코드에서 첫줄에는 `package` 를 사용하고, 다음 줄에는 `import` 를 사용할 수 있다.
    `import` 를 사용하면 다른 패키지에 있는 클래스를 가져와서 사용할 수 있다.
    `import` 를 사용한 덕분에 코드에서는 패키지 명을 생략하고 클래스 이름만 적을 수 있다.
     */
}
