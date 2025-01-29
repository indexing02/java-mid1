package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {

        //a와 b가 서로 다른 인스턴스를 참조하게 해서 사이드 이펙트 문제 해결
        Address a = new Address("서울");
        Address b = new Address("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");  // b의 값만 부산으로 변경
        System.out.println("b -> 부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
