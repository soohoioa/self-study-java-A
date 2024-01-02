package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue); //부모 메서드 안에서 접근 가능
        System.out.println("privateValue = " + privateValue); //부모 메서드 안에서 접근 가능

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
} // 부모 클래스인 `Parent` 에는 `public` , `protected` , `default` , `private` 과 같은 모든 접근 제어자가 필드와 메 서드에 모두 존재한다.
