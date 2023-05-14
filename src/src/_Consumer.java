import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "99999999");
        greetCustomer(maria);

    }
    static BiConsumer<Customer, Boolean> greetConsumerV2 = (customer, aBoolean) -> System.out.println("Hello" + customer.customerName +", phone: "+(aBoolean?customer.customerPhoneNumber:"!!!!!"));

    static Consumer<Customer> greeCustomerConsumer = customer -> System.out.println("Hello" + customer.customerName +", phone: "+customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello" + customer.customerName +", phone: "+customer.customerPhoneNumber);
    }


    static class Customer{
        private final String customerName;

        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
