package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        Scanner sc = new Scanner(System.in);
        String guestName = sc.nextLine();

        AuthGrade guest = AuthGrade.valueOf(guestName.toUpperCase());
        printAuth(guest);
    }

    private static void printAuth(AuthGrade guest) {
        System.out.println("당신의 등급은 " + guest.getDescription() + " 입니다.");
        System.out.println("==메뉴 목록==");

        if(guest.getLevel() > 0){
            System.out.println("-메인화면");
        }if(guest.getLevel() > 1){
            System.out.println("-이메일 관리 화면");
        }if (guest.getLevel() >  2) {
            System.out.println("-관리자 화면");
        }

    }
}
