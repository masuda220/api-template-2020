package morecon.domain.model.order;

import morecon.domain.indentifier.OrderLineId;
import morecon.domain.model.product.Power;
import morecon.domain.model.product.Product;
import morecon.domain.model.product.UnitPrice;
import morecon.domain.type.Quantity;

/**
 * 明細行
 */
public class Line {
    OrderLineId orderLineId;
    Product product;
    Power power;
    Quantity quantity;
    UnitPrice unitPrice;

    public Line() {
    }

    public Line(Product product, Power power, Quantity quantity, UnitPrice unitPrice) {
        this.product = product;
        this.power = power;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Line{" +
                "orderLineId=" + orderLineId +
                ", product=" + product +
                ", power=" + power +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
