package product_service.repository;

import product_service.dto.ProductSearchRequest;
import product_service.entity.Product;

import java.util.List;

public interface ProductCustomRepository {
    List<Product> searchProducts(ProductSearchRequest request);
}
