package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {

        // str에서 .txt 문자열에 언제부터 시작하는지 위치를 찾아 출력하기
        String str = "hello.txt";
        System.out.println("index = " + str.indexOf(".txt"));
    }
}
