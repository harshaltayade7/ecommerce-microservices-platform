package product_service.service;

import product_service.dto.ProductRequest;
import product_service.dto.ProductResponse;
import product_service.dto.ProductSearchRequest;
import product_service.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductRequest productRequest);
    Product getProductById(String id);
    Product updateProduct(String id, ProductRequest productRequest);
    ProductResponse getAllProducts();
    List<Product> getAllFilteredProducts(ProductSearchRequest productSearchRequest);
}
