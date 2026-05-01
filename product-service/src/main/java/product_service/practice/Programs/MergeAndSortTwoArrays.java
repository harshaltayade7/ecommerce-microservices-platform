package product_service.practice.Programs;

import product_service.entity.Product;
import product_service.enums.ProductType;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class MergeAndSortTwoArrays {
    List<Integer> list1;
    List<Integer> list2;

    public  MergeAndSortTwoArrays(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

//    public List<Integer> mergeAndSort(String order) {
//        List<Integer> mergedList = new ArrayList<>();
//        List<Product>  productList = Arrays.asList(new Product("aldj", "shampoo", "shampoo", new BigDecimal("50"), 9, Collections.singletonList(ProductType.CLOTHING)),
//                new Product("aldddj", "shampoo", "shampoo", new BigDecimal("20"), 30, Collections.singletonList(ProductType.CLOTHING)));
//
//        System.out.println(productList.stream().filter(p-> p.getQuantity() <= 222).collect(Collectors.groupingBy( p-> p.getName() + "_"+p.getQuantity())));
//
//        mergedList.addAll(list1);
//        mergedList.addAll(list2);
//        if(order.equals("asc")) {
//            return mergedList.stream().sorted().toList();
//        }
//        return mergedList.stream().sorted(Comparator.reverseOrder()).toList();
//    }
}
