package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {

        //replace()를 사용해서 java라는 단어를 jvm으로 변경하기
        String input = "hello java spring jpa java";
        System.out.println(input.replace("java","jvm"));
    }
}
