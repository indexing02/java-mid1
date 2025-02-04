package enumeration.ex02;

public class ClassGradeEX2_2 {
    public static void main(String[] args) {

        int price = 10_000;

        DiscountService discountService = new DiscountService();

        // 생성자를 private로 막아 외부에서 ClassGrade를 생성하지 못하게 막음
        //ClassGrade newClassGrade = new ClassGrade();
        //int result = discountService.discount(newClassGrade, price);
        //System.out.println("newClassGrade 할인 금액:  " + result);

    }
}
