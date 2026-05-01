package product_service.enums;

import java.util.List;

public enum ProductType {
    ELECTRONICS,
    CLOTHING,
    FOOD,
    FURNITURE;

    public static final List<ProductType> LIST = List.of(ELECTRONICS, CLOTHING, FOOD, FURNITURE);


}