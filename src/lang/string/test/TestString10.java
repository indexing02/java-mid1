package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {

        //split()를 사영헤사 fruits를 분리하고, join()를 사용해서 분리한 문자들을 하나로 합치기
        String fruits = "apple,banana,mango";

        String[] fruitsArray = fruits.split(",");

        for (String string : fruitsArray) {
            System.out.println(string);
        }

        System.out.println("joinedString = " + String.join("->", fruitsArray));
    }
}
