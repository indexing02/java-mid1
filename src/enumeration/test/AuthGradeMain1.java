package enumeration.test;

import enumeration.ref3.Grade;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            printAuth(authGrade);
        }
    }

    private static void printAuth(AuthGrade authGrade) {
        System.out.println("grade: " + authGrade + ", level=" + authGrade.getLevel() + ", 설명=" + authGrade.getDescription());
    }
}
