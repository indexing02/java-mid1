package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {

        //문자로 입력된 str1, str2 두수의 합 구하기
        String str1 = "10";
        String str2 = "20";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;

        System.out.println("두수의 합: " + sum);
    }
}
