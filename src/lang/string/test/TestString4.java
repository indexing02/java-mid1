package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {

        //subString()을 사용해서, hello 부분과 .txt 부분 분리하기
        String str = "hello.txt";

        System.out.println("filename = " + str.substring(0,5));
        System.out.println("extName = " + str.substring(5,9));
    }
}
