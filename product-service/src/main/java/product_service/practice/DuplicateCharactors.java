package product_service.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactors {
    public static void main(String[] args) {
        String name = "afgaajdaldddaaf";
        Map<String, Long> counterList= Arrays.asList(name.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        counterList.forEach((a,b)-> {
            if(b > 1) {
                System.out.println(a + " : "+b);
            }
        });
    }

}
