package enumeration.ex03;

import static enumeration.ex03.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price){

        int discountPercent = 0;

        if(grade == BASIC){
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        }else if(grade == DIAMOND){
            discountPercent = 30;
        }else{
            System.out.println(grade + " 할인X");
        }

        return price * discountPercent / 100;
    }
}
