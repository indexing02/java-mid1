package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder valueAdder1 =  valueAdder.add(1);
        ValueAdder valueAdder2 = valueAdder.add(2);
        ValueAdder valueAdder3 = valueAdder.add(3);

        int result = valueAdder.getValue();
        System.out.println("result = " + result);

        System.out.println("valueAdder1 = " + valueAdder1);
        System.out.println("valueAdder2 = " + valueAdder2);
        System.out.println("valueAdder3 = " + valueAdder3);
    }
}
