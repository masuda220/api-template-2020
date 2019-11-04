package morecon.domain.model.product;

import java.util.List;

/**
 * 商品リスト
 */
public class Products {
    List<Product> list;

    public Products(List<Product> list) {
        this.list = list;
    }

    public List<Product> list() {
        return list;
    }
}
