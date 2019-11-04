package morecon.application.repository;

import morecon.domain.model.cart.CartIdentifier;
import morecon.domain.model.cart.CartItem;
import morecon.domain.model.cart.CartItems;
import morecon.domain.model.product.Product;

/**
 * ショッピングカートリポジトリ
 */
public interface CartRepository {

    CartItems find(CartIdentifier cartIdentifier);

    CartItem find(CartIdentifier cartIdentifier, Product product);

    void update(CartIdentifier cartIdentifier, CartItem cartItem);

    CartIdentifier create();
}
