package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
       int n1 = incrementByOne(1);
        System.out.println(n1);
        int n2 = incrementByOneFunction.apply(11);
        System.out.println(n2);

    }
    static Function<Integer, Integer> incrementByOneFunction = number -> number +1;

    static int incrementByOne(int number){
        return number +1;
    }
}
