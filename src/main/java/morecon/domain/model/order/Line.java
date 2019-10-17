package morecon.domain.model.order;

import morecon.domain.model.product.Power;
import morecon.domain.model.product.Product;
import morecon.domain.type.Quantity;

/**
 * 明細行
 */
public class Line {
    Product product;
    Power power;
    Quantity quantity;

    public Line() {
    }

    public Line(Product product, Power power, Quantity quantity) {
        this.product = product;
        this.power = power;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Line{" +
                "product=" + product +
                ", power=" + power +
                ", quantity=" + quantity +
                '}';
    }
}
