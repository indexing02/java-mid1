package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String str1, String str2) {
        //main() 메서드 개발자와 isSame() 개발자가 서로 다른 상황에서는
        //매개변수로 넘어오는 String 인스턴스가 리터럴인지 new String()으로 만든건지
        //확인할 수 있는 방법이 없기 때문에 문자열 비교는 항상 equals()을 사용해야 함
        // return str1 == str2;
        return str1.equals(str2);
    }
}
