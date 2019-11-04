package morecon.datasource.product;

import morecon.application.repository.product.ProductRepository;
import morecon.domain.indentifier.ProductCode;
import morecon.domain.indentifier.ProductId;
import morecon.domain.model.product.Product;
import morecon.domain.model.product.Products;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDatasource implements ProductRepository {

    // TODO データベースから取得する
    Map<ProductId, Product> map = new LinkedHashMap<>();
    {
        Product one = new Product(new ProductId(3438), "メランジェシュエット", new ProductCode("MEL-cet-1d-10-sbe"));
        Product two = new Product(new ProductId(1107), "モテコンガールズマンスリー", new ProductCode("motecon-1m-choma"));

        map.put(one.id(), one);
        map.put(two.id(), two);
    }

    @Override
    public Products all() {
        List<Product> list = new ArrayList<>(map.values());
        return new Products(list);
    }

    @Override
    public Product find(ProductId productId) {
        return map.get(productId);
    }
}
