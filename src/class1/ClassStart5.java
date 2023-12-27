package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //배열 선언
        Student[] students = new Student[]{student1, student2};
        // 생성과 선언을 동시에 하는 경우 Student[] students = {student1, student2}; 이렇게도 최적화하여 사용이 가능하다.

        //for 문 적용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
        /*
        **향상된 for 문(Enhanced For Loop)**
        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
         */
    }
}
