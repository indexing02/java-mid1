package enumeration.ex03;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        //상수의 선언 순서 확인 가능
        //ordinal 가급적 사용하지 않는 것이 좋음
        // -> 중간에 상수를 선언하는 위치가 변경되면 전체 상수의 위치가 변경되기 때문
        // -> 데이터베이스나 파일에 저장된 데이터에 문제 발생
        for (Grade grade : values) {
            System.out.println("name = " + grade.name() + ", ordinal = " + grade.ordinal());
        }

        //String -> ENUM 변환
        //잘못된 문자면 IllegalArgumentException 예외 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);

    }
}
