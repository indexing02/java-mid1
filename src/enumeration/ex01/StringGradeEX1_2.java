package enumeration.ex01;

public class StringGradeEX1_2 {
    public static void main(String[] args) {

        //문자열 상수를 써도 근본적인 해결 불가
        int price = 10_000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP",price);
        System.out.println("VIP 할인 금액: " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD",price);
        System.out.println("DIAMONDD 할인 금액: " +  diamondd);

        //소문자 입력
        int gold = discountService.discount("gold",price);
        System.out.println("gold 할인 금액: " +  gold);

    }
}
