package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {

        //str 문자열 반대로 뒤집기
        String str = "Hello Java";

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
