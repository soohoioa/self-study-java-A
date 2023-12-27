package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90); // 전달한 학생 객체의 필드에 값을 설정한다.

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1); // 전달한 학생 객체의 필드 값을 읽어서 출력한다
        printStudent(student2);
    }
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }
}// 참조형은 메서드를 호출할 때 참조값을 전달한다. 따라서 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거 나, 값을 읽어서 사용할 수 있다.
