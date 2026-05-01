package product_service.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import product_service.dto.ProductRequest;
import product_service.dto.ProductResponse;
import product_service.dto.ProductSearchRequest;
import product_service.entity.Product;
import product_service.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get-products")
    public ProductResponse getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/get-product/{id}")
    public Product getProduct (@PathVariable String id){
        return productService.getProductById(id);

    }
    @PutMapping("/update-product/{id}")
    public Product updateProduct(@PathVariable String id,@RequestBody @Valid ProductRequest productRequest){
        return productService.updateProduct(id, productRequest);
    }

    @PostMapping("/search")
    public List<Product> getAllFilteredProducts(@RequestBody ProductSearchRequest productSearchRequest) {
        return productService.getAllFilteredProducts(productSearchRequest);
    }

    @PostMapping("/create-products")
    public Product createProduct(@Valid @RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }
}
