package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        String string = s1.append("A").append("B").append("C").append("D")
                    .insert(4,"java")
                    .delete(4,8)
                    .reverse()
                    .toString();

        System.out.println("string: " + string);

    }
}
