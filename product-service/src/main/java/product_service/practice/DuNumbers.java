package product_service.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuNumbers {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,3,4,5,6,1,8,9);

        numberList.stream().flatMap(a->numberList.stream().filter(b->a+b == 6).map(b-> "("+a+","+b+")")).forEach(System.out::println);

        Integer sum = numberList.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

        String words = "Java Python Java C";

        Map<String, Long> wordList = Arrays.asList(words.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordList.forEach((a,b)-> {
            if(b>1) {
                System.out.println( a + ": " +b);
            }
        });

        String words1 = "adlkjadlkjslaklsld";
        Map<String, Long> wordList1 = Arrays.asList(words1.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordList1.forEach((a,b)-> {
            if(b>1) {
                System.out.println( a + ": " +b);
            }
        });
    }
}
