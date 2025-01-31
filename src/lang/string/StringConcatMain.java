package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        String result1 = a.concat(b);

        //문자열은 자주 다루어지기 때문에 자바에서 편의상 + 연산을 제공함
        String result2 = a + b;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " +result2);
    }
}
