package enumeration.ref2;

public class ClassGradeRefMain2 {
    public static void main(String[] args) {

        int price = 10_000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("Basic 할인 금액: " + basic);
        System.out.println("Gold 할인 금액: " + gold);
        System.out.println("Diamond 할인 금액: " + diamond);

    }
}
