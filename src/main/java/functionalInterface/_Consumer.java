package functionalInterface;

import java.util.function.Consumer;

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
