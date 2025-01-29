package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법은 없음
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //불변객체로 값 변경 불가 -> 새로운 객체를 생성해야함
        //불변이라는 제약을 사용하여 사이드 이펙트 문제를 막을 수 있음
        b = new ImmutableAddress("부산");
        System.out.println("b -> 부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
