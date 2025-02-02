package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {

        // 래퍼 클래스를 통해서 null을 반환될 수 있게 리팩토링
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if(myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
