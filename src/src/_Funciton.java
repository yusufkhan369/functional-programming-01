import java.util.function.Function;

public class _Funciton {
    public static void main(String[] args) {
        int increment = incrementNumber(0);
        System.out.println(increment);

        System.out.println(add1AndMultiply10.apply(3));


    }


    static Function<Integer, Integer> incrementByOne = number ->  number+1;

    static Function<Integer, Integer> multBy10 = integer -> integer*10;

    static Function<Integer, Integer> add1AndMultiply10 = incrementByOne.andThen(multBy10);

    static int incrementNumber(int number){
        return number+1;
    }
}
