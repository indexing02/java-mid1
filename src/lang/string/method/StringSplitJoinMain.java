package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");

        for (String string : splitStr) {
            System.out.println(string);
        }

        //join
        String joinStr = String.join("-", splitStr);
        System.out.println("문자열 배열 연결 = " + joinStr);


    }
}
