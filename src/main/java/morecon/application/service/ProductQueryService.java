package morecon.application.service;

import morecon.application.repository.product.ProductRepository;
import morecon.domain.indentifier.ProductId;
import morecon.domain.model.product.Product;
import morecon.domain.model.product.Products;
import org.springframework.stereotype.Service;

/**
 * 商品参照サービス
 */
@Service
public class ProductQueryService {

    ProductRepository productRepository;

    public ProductQueryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Products all() {
        return productRepository.all();
    }

    public Product find(ProductId productId) {
        return productRepository.find(productId);
    }
}
