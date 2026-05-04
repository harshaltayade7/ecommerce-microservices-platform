package product_service.practice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfIntegerList {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 1, 4, 2, 6, 7, 8, 9);
        IntSummaryStatistics sum = numberList.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(sum);
    }
}
