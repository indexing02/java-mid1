package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";

        //String은 불변 객체로 변경이 필요한경우 기존값을 변경하지 않고
        //새로운 결과를 만들어서 반환함
        //때문에 변수를 사용해서 값을 저장해야함
        String str2 = str1.concat("world");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
