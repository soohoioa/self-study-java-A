package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent (String name, int age, int grade) { // 메서드를 만들고 객체를 생성하는 부분도 이 메서드안에 함께 포함했다.
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    } // 안에서 인스턴스를 만들었지만 밖에서도 얼마든지 사용가능하다.
    /*
    메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려주어야 한다.
    그래야 메서드 밖에서 이 객체를 사용할 수 있다.
    메서드는 호출 결과를 반환(`return`)을 할 수 있다. 메서드의 반환 기능을 사용해서 만들어진 객체의 참조값을 메서드 밖으로 반환하면 된다.
     */

    static void printStudent(Student student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }
}
