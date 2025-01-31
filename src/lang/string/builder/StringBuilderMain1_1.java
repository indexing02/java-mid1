package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("A");
        s1.append("B");
        s1.append("C");
        s1.append("D");
        System.out.println("s1: " + s1);

        s1.insert(4, "java");
        System.out.println("insert: " + s1);

        s1.delete(4,8);
        System.out.println("delete: " + s1);

        s1.reverse();
        System.out.println("reverse: " + s1);

        //StringBuilder -> String
        String string = s1.toString();
        System.out.println("string: " + string);

    }
}
