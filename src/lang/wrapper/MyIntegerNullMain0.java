package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {

        //배열안에 값이 있다면 다시 그 그값을 반환하는 메서드에서
        //배열에 값이 들어있지 않은경우에도 값을 반환해야 되기 때문에 배열에 들어있는 -1이
        //반환 된건지 들어있지 않다는 의미로 -1이 반환된건지 구별하기 어려움

        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100));
    }

    private static int findValue(int[] intArr,  int target) {
        for (int value : intArr) {
            if(value == target) {
                return value;
            }
        }
        return -1;
    }
}
