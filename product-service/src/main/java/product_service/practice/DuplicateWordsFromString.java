package product_service.practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsFromString {
    public static void main(String[] args) {
        String name = "Java Python Java React";
        Map<String, Long> couterList = Arrays.asList(name.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(couterList);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(name.split(" ").length);
    }
}
