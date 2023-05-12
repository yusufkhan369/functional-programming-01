import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isValidPhone.test("vjsd"));

    }

    static Predicate<String> isValidPhone = phone -> phone.startsWith("0") && phone.length()==11;
}
