package product_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import product_service.dto.ProductRequest;
import product_service.dto.ProductResponse;
import product_service.dto.ProductSearchRequest;
import product_service.entity.Product;
import product_service.enums.ProductType;
import product_service.exception.ProductNotFoundException;
import product_service.repository.ProductCustomRepository;
import product_service.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService  {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(ProductRequest productRequest) {
        Product product = new Product();
        product.setDescription(productRequest.getDescription());
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setQuantity(productRequest.getQuantity());

        return productRepository.save(product);
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found"));
    }

    @Override
    public Product updateProduct(String id, ProductRequest productRequest) {
        Product product = productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found, cant update"));
        product.setQuantity(productRequest.getQuantity());
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setDescription(productRequest.getDescription());
        String abc="abc";
        return productRepository.save(product);
    }

    @Override
    public ProductResponse getAllProducts() {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductList(productRepository.findAll().stream()
//                .filter(product -> product.getPrice().compareTo(BigDecimal.valueOf(20)) < 0 && product.getName().equals("parle-g"))
                .sorted(Comparator.comparing(Product::getPrice).thenComparing((Product::getName)))
                .toList());
        productResponse.setProductTypes(ProductType.LIST);
        return productResponse;
    }

    @Override
    public List<Product> getAllFilteredProducts(ProductSearchRequest productSearchRequest) {
        return productRepository.searchProducts(productSearchRequest);
    }
}
