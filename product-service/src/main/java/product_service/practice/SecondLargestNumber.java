package product_service.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 1, 4, 2, 6, 7, 8, 9);
        int b = numberList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).toList().get(1);
        System.out.println(b);
    }
}
