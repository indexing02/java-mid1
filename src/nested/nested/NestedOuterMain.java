package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        //NestedOuter outer = new NestedOuter();
        //구조상 NestedOuter 바깥 클래스와 Nested 정적 중첩 클래스의 인스턴스는
        //서로 아무관계과 없으므로 정적 중첩 클래스의 인스턴스만 따로 생성하면 된다
        //구조상으로만 중첩해 두었을 뿐

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
