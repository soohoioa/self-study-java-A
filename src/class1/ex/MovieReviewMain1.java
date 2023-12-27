package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        /*
        예제1. 영화 리뷰 관리하기1
        영화 리뷰 정보를 담을 수 있는 `MovieReview` 클래스를 만들어라.
        **요구 사항**
        `MovieReview` 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
            영화 제목 ( `title` )
            리뷰 내용 ( `review` )
        `MovieReviewMain` 클래스 안에 `main()` 메서드를 포함하여, 영화 리뷰 정보를 선언하고 출력하시오.
         */
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + inception.title + " , 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + " , 리뷰: " + aboutTime.review);

    }
}
