package product_service.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsFromList {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Java","Python","Java","React");

        Map<String, Long> counterList= wordList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        counterList.forEach((a,b)-> {
            if(b > 1) {
                System.out.println(a + " : "+b);
            }
        });
    }
}
