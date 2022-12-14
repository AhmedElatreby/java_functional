package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // increment number by one using custom function
        int n1 = incrementByOne(1);
        System.out.println(n1);

        // increment number by using Interface Function
        int n2 = incrementByOneFunction.apply(11);
        System.out.println(n2);

        // multiply number by 10 using custom function
        int m1 = multiplyByTen(5);
        System.out.println(m1);

        // multiply number by 10 using Interface Function
        int m2 = multiplyByTenFunction.apply(6);
        System.out.println(m2);

        // use two function together with (andThen)
        int m3 = incrementByOneFunction.andThen(multiplyByTenFunction).apply(4);
        System.out.println("(4 + 1) function * 10 Function = " + m3);

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4,100));
        System.out.println(integerIntegerIntegerBiFunction.apply(4,100));

    }
    // use Interface function to increase a number by 1
    static Function<Integer, Integer> incrementByOneFunction = number -> number +1;

    // use Interface function to multiply a number by 1
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    // create a function to increase a number by 1
    static int incrementByOne(int number){
        return number +1;
    }

    // create a function to multiply a number by 10

    static int multiplyByTen (int number){
        return number * 10;
    }

    static BiFunction<Integer, Integer, Integer> integerIntegerIntegerBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
