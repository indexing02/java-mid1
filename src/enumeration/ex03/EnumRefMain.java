package enumeration.ex03;

import enumeration.ex02.ClassGrade;

public class EnumRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " +  refValue(Grade.BASIC));
        System.out.println("ref GOLD = " +  refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    //열거형은 toString()을 재정의 하기 때문에 참조값을 읽기 위한 메서드
    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
