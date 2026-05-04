package product_service.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumberAndCount {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 1, 4, 2, 6, 7, 8, 9);
        Map<Integer, Long> counterList = numberList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        counterList.forEach((a,b) ->{
            if(b > 1) {
                System.out.println(a + " :"+b);
            }
        });
    }
}
