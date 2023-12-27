package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // `Student` 클래스를 기반으로 `student1` , `student2` 인스턴스를 생성
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // `Student` 를 담을 수 있는 배열을 생성하고, 해당 배열에 `student1` , `student2` 인스턴스를 보관
        // **자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.**
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        /*
        자바에서 변수의 대입(`=`)은 모두 변수에 들어있는 값을 복사해서 전달하는 것이다.
        오른쪽 변수인 `student1` , `student2` 에는 참조값이 들어있다. 그래서 이 값을 복사해서 왼쪽에 있는 배열에 전달한다.
        따라서 기존 `student1` , `student2` 에 들어있던 참조값은 당연히 그대로 유지된다.
         */

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
        /*
        주의!
        변수에는 인스턴스 자체가 들어있는 것이 아니다! 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다!
        따라서 대입 (`=`)시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.
         */
    }
}
