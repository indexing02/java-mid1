package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {

        //배열에 입력된 모든 숫자의 합 구하기(숫자는 double 형이 될 수 있음)
        String[] array = {"1.5" , "2.5" , "3.0"};

        double sum = 0;
        for (String string : array) {
            double num = Double.parseDouble(string);
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
