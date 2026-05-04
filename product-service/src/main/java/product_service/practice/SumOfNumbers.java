package product_service.practice;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer sumRequired = 6;

        numberList.stream()
                .flatMap(a->numberList.stream()
                        .filter(b-> a+b == sumRequired)
                        .map(b -> "(" + a + ", " + b + ")")
                )
                .forEach(System.out::println);
        ;
    }
}
