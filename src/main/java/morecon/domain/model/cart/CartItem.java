package morecon.domain.model.cart;

import morecon.domain.model.product.Product;

/**
 * ショッピングカート内の商品
 */
public class CartItem {

    Product product;

    Quantity quantity;

    public CartItem(Product product, Quantity quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product product() {
        return product;
    }

    public Quantity quantity() {
        return quantity;
    }

    public CartItem plus(Quantity quantity) {
        return new CartItem(product, this.quantity.plus(quantity));
    }

    public CartItem update(Quantity quantity) {
        return new CartItem(product, quantity);
    }

    public boolean is(Product product) {
        return this.product.equals(product);
    }
}
