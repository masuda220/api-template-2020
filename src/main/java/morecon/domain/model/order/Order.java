package morecon.domain.model.order;

import morecon.domain.indentifier.OrderId;
import morecon.domain.model.customer.Purchaser;

/**
 * 注文
 */
public class Order {
    OrderId orderId;
    Purchaser purchaser;
    Lines lines;
    Shipping shipping;

    public Order() {
    }

    public Order(OrderId orderId, Purchaser purchaser, Lines lines, Shipping shipping) {
        this.orderId = orderId;
        this.purchaser = purchaser;
        this.lines = lines;
        this.shipping = shipping;
    }

//    public static Order from(Attempt attempt) {
//        return new Order(OrderId orderId, attempt.purchaser, attempt.lines, attempt.shipping);
//    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", purchaser=" + purchaser +
                ", lines=" + lines +
                ", shipping=" + shipping +
                '}';
    }
}
