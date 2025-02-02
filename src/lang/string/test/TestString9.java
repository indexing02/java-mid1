package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {

        //split()를 사용해서 이메일의 id 부분과 도메인 부분 분리하기
        String email = "hello@example.com";

        String[] parts = email.split("@");
        String id = parts[0];
        String domain = parts[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
