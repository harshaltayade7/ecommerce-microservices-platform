package product_service.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import product_service.dto.ProductSearchRequest;
import product_service.entity.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductCustomRepositoryImpl implements ProductCustomRepository{
    private final MongoTemplate mongoTemplate;

    @Override
    public List<Product> searchProducts(ProductSearchRequest request) {
        Query query= new Query();
        List<Criteria> criteriaList = new ArrayList<>();
        if(request.getName() != null && !request.getName().isEmpty()) {
            criteriaList.add(Criteria.where("name").regex(request.getName(),"i"));
        }
        if(request.getMinPrice() != null) {
            criteriaList.add(Criteria.where("price").gte(request.getMinPrice()));
        }
        if(request.getMaxPrice()  != null) {
            criteriaList.add(Criteria.where("price").lte(request.getMaxPrice()));
        }
        if(request.getMinQuantity()  != null) {
            criteriaList.add(Criteria.where("quantity").gte(request.getMinQuantity()));
        }

        if(request.getMaxQuantity()  != null) {
            criteriaList.add(Criteria.where("quantity").lte(request.getMaxQuantity()));
        }
        if(!criteriaList.isEmpty()) {
            query.addCriteria(new Criteria().andOperator(criteriaList.toArray(new Criteria[0])));
        }

        int page = request.getPage() != null ? request.getPage() : 0;
        int size = request.getSize() != null ? request.getSize() : 10;
        Sort sort = Sort.unsorted();

        if(request.getSortBy() != null && !request.getSortBy().isEmpty()) {
            String[] fields = request.getSortBy().split(",");

            Sort.Direction direction = "desc".equalsIgnoreCase(request.getDirection()) ? Sort.Direction.DESC : Sort.Direction.ASC;
            sort = Sort.by(direction, fields);
        }

        PageRequest pageRequest = PageRequest.of(page,size,sort);
        query.with(pageRequest);

        return mongoTemplate.find(query, Product.class);
    }
}
