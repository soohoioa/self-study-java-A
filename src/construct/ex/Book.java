package construct.ex;

public class Book {
    /*
    예제1. Book 과 생성자
    BookMain` 코드가 작동하도록 `Book` 클래스를 완성하세요.
    특히 `Book` 클래스의 생성자 코드에 중복이 없도록 주의하세요.
     */
    String title; //제목
    String author; //저자
    int page; //페이지 수

    // 기본 생성자 사용
    Book() {
        this("", "", 0);
    }

    // title 과 author 만을 매개변수로 받는 생성자
    Book(String title, String author) {
        this(title, author, 0);
    }

    // 모든 필드를 매개변수로 받는 생성자
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }

}
