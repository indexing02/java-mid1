package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포맷팅 : 날짜,시간 -> 문자
        LocalDateTime date = LocalDateTime.of(20204,12,31,13,30,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = date.format(formatter);
        System.out.println("formattedDate = " + formattedDate);

        //파싱: 문자 -> 날짜, 시간
        String input = "2030-01-01 11:30:00";
        LocalDateTime parseDateTime = LocalDateTime.parse(input, formatter);
        System.out.println("parseDateTime = " + parseDateTime);
    }
}
