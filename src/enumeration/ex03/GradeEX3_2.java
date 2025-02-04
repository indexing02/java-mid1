package enumeration.ex03;

public class GradeEX3_2 {
    public static void main(String[] args) {

        int price = 10_000;

        DiscountService discountService = new DiscountService();

        // 열거형 클래스를 사용하여 인스턴스 생성 불가
        //Grade grade = new Grade();
        //int result = discountService.discount(grade, price);
        //System.out.println("grade 할인 금액:  " + result);

    }
}
