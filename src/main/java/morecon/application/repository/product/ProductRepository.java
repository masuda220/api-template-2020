package morecon.application.repository.product;

import morecon.domain.indentifier.ProductId;
import morecon.domain.model.product.Product;
import morecon.domain.model.product.Products;

/**
 * 商品リポジトリ
 */
public interface ProductRepository {

    Products all();

    Product find(ProductId productNumber);

}
