package morecon.domain.model.product;

import morecon.domain.indentifier.ProductCode;
import morecon.domain.indentifier.ProductId;

import java.util.Objects;

public class Product {
    ProductId id;
    String name;
    ProductCode productCode;

    public Product() {
    }

    public Product(ProductId id, String name, ProductCode productCode) {
        this.id = id;
        this.name = name;
        this.productCode = productCode;
    }

    public ProductId id() {
        return id;
    }

    public String name() {
        return name;
    }

    public ProductCode code() {
        return productCode;
    }

    @Override
    public boolean equals(Object other) {
        return id.equals(((Product)other).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, productCode);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productCode=" + productCode +
                '}';
    }
}
