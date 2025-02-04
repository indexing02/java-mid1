package enumeration.ex02;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가 -> 메인화면에서 ClassGrade 생성하는것을 막음
    private ClassGrade() {
    }
}
