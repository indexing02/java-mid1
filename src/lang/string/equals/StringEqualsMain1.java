package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        //new String()으로 서로 다른 인스턴스를 생성하여 동일성 비교에 실패
        //String 클래스는 내부 문자열 값을 비교하도록 equals() 메서드를 오버라이딩
        //해뒀기 때문에 동등성 비교는 성공
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";

        //리터럴을 사용하면 문자열 풀에서 미리 String 인스턴스를 만들어놓고
        //같은 문자열이 있으면 더이상 만들지 않음(메모리 사용 최적화)
        //결론적으로 둘은 같은 참조값을 가져 동일성, 동등성 비교에 모두 성공
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
