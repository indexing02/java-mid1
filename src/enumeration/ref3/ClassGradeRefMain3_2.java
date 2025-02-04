package enumeration.ref3;

public class ClassGradeRefMain3_2 {
    public static void main(String[] args) {

        int price = 10_000;

        System.out.println("Basic 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("Gold 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("Diamond 할인 금액: " + Grade.DIAMOND.discount(price));

    }
}
