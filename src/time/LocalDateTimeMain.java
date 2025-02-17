package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2025,9,10,5,25,9);
        System.out.println("현재 날짜 시간 = " + nowDt);
        System.out.println("지정 날짜 시간 = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = nowDt.toLocalDate();
        LocalTime localTime = nowDt.toLocalTime();
        System.out.println("LocalDate = " + localDate);
        System.out.println("LocalTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(100);
        System.out.println("지정 날짜시간+100d = " + ofDtPlus);

        LocalDateTime ofDtPlusYear = ofDt.plusYears(10);
        System.out.println("지정 날짜시간+10y = " + ofDtPlusYear);

        //비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간과 지정 날짜 시간이 같은가? " + nowDt.isEqual(ofDt));

    }
}
