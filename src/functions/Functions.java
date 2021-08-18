package functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Functions {
    public static void main(String[] args) {

        String line = "test";

        Predicate<Integer> predicate = value -> value > 1500.0;
        System.out.println(predicate.test(1501));


        Consumer<String> consumer = line1 -> printChars(line1.toCharArray());
        consumer.accept("test1");

        System.out.println(transformIntToString(11));

        Supplier<String> supplier = line::toUpperCase;
        System.out.println(supplier.get());

    }

    private static String transformIntToString(int i) {
        Function<Integer, String> function = value -> {
            String[] values = new String[]{"one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine", "ten"};
            return value > 0 && value < 11 ? values[value - 1] : "unknown";
        };
        return function.apply(i);
    }

    private static void printChars(char[] arr) {
        IntStream.iterate(0, i -> i > arr.length, i -> i + 1)
                .map(i -> arr[i])
                .forEach(System.out::println);
    }
}

