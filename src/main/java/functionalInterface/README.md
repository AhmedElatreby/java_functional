### Interface Function<T,R>

##### T - the type of the input to the function
R - the type of the result of the function

```java
static Function<Integer, Integer> incrementByOneFunction
        = number -> number +1;
```
#### same as 
```java
static int incrementByOne(int number){
        return number +1;
    }
```

##### To call the function 
```java
        int n1 = incrementByOne(1);
        System.out.println(n1);
        
        // Using Function Interface
        int n2 = incrementByOneFunction.apply(11);
        System.out.println(n2);
```
#### use andThan
```java
        static Function<Integer, Integer> incrementByOneFunction = number -> number +1;

        // use Interface function to multiply a number by 1
        static Function<Integer, Integer> multipyByTenFunction = number -> number * 10;

        // use two function together with (andThen)
        int m3 = incrementByOneFunction.andThen(multipyByTenFunction).apply(4);
        System.out.println("(4 + 1) function * 10 Function = " + m3);
```

### Consumer Functional interface
```java
public class _Consumer {
    public static void main(String[] args) {
        // Normal java function
       Customer Ahmed = new Customer( "Ahmed", "012012012");
       greetCustomer(Ahmed);
       greetCustomer(Ahmed);

    }
    // Consumer Functional interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello  " + customer.customerName +
                    ", thank you for registering " +
                    customer.CustomerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello  " + customer.customerName +
                ", thank you for registering " +
                customer.CustomerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String CustomerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.CustomerPhoneNumber = customerPhoneNumber;
        }
    }
}
```

### Predicate Functional interface
```java
public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000045600"));
        System.out.println(isPhoneNumberValid("0900045600"));

        System.out.println();
        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000045600"));
        System.out.println(isPhoneNumberValidPredicate.test("0900045600"));

    }
    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}

```