package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {

        // length()를 사용해서 배열에 들어있는 모든 문자열의 길이 합 구하기
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ":" + arr[i].length());
            sum += arr[i].length();
        }

        System.out.println("sum = " + sum);
    }
}
