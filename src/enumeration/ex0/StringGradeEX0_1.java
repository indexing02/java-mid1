package enumeration.ex0;

public class StringGradeEX0_1 {
    public static void main(String[] args) {

        int price = 10_000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("Basic 할인 금액: " + basic);
        System.out.println("Gold 할인 금액: " + gold);
        System.out.println("Diamond 할인 금액: " + diamond);

    }
}
