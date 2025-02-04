package enumeration.ref2;

import static enumeration.ex03.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }
}
