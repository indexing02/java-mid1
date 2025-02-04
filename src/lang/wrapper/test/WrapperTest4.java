package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        //오토박싱, 오토언박싱
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer -> int(오토언박싱)
        int intValue = integer1;
        System.out.println("intValue = " + intValue);
        
        //int -> Integer(오토박싱)
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
