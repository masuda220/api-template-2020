package morecon.datasource.product;

import morecon.application.repository.product.ProductRepository;
import morecon.domain.indentifier.ProductId;
import morecon.domain.model.product.Product;
import morecon.domain.model.product.Products;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDatasource implements ProductRepository {

    @Override
    public Products all() {
        return null;
    }

    @Override
    public Product find(ProductId productNumber) {
        return null;
    }
}
