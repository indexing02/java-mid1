package lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1  = new Rectangle(100,20);
        Rectangle rectangle2  = new Rectangle(100,20);

        //toString()메서드 오버라이딩
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        //equals()메서드 오버라이딩(동등성 비교 성공)
        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
    }
}
