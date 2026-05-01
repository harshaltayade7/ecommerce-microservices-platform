package product_service.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductRequest {
    @NotNull(message = "name is required")
    private String name;
    @NotBlank(message = "description is required")
    private String description;
    private BigDecimal price;
    @Min(value = 1, message = "Quantity must be greateer than one")
    private Integer quantity;
}
