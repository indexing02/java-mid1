package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        //기준날짜 기준으로 2주뒤 날짜 5번 출력하기
        LocalDate startDate = LocalDate.of(2024, 1, 1);

        for(int i =0; i<5; i++){
           LocalDate nextDate = startDate.plus(2*i, ChronoUnit.WEEKS);
            System.out.println(nextDate);
        }
    }
}
