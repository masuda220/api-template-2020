package morecon.domain.model.cart;

/**
 * ショッピングカート内の商品数
 */
public class Quantity {

    public static final Quantity ZERO = new Quantity(0);

    public static final Quantity ONE = new Quantity(1);

    int value;

    public Quantity(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public Quantity plus(Quantity quantity) {
        return new Quantity(this.value + quantity.value);
    }
}
