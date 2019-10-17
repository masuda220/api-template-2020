package morecon.domain.model.order;

import morecon.domain.model.customer.Purchaser;

/**
 * 注文
 */
public class Order {
    Purchaser purchaser;
    Lines lines;

    public Order(Purchaser purchaser, Lines lines) {
        this.purchaser = purchaser;
        this.lines = lines;
    }

    public static Order from(Attempt attempt) {
        return new Order(attempt.purchaser, attempt.lines);
    }

    @Override
    public String toString() {
        return "Order{" +
                "purchaser=" + purchaser +
                ", lines=" + lines +
                '}';
    }
}
