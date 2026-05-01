package product_service.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductSearchRequest {
    private String name;            // optional
    private BigDecimal minPrice;    // optional
    private BigDecimal maxPrice;    // optional
    private Integer minQuantity;    // optional
    private Integer maxQuantity;    // optional

    private String sortBy;     // e.g., "price,name"
    private String direction;  // "asc" or "desc"
    private Integer page;      // e.g., 0
    private Integer size;

}
