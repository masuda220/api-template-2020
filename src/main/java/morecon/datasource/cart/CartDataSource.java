package morecon.datasource.cart;

import morecon.application.repository.CartRepository;
import morecon.domain.model.cart.CartIdentifier;
import morecon.domain.model.cart.CartItem;
import morecon.domain.model.cart.CartItems;
import morecon.domain.model.product.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class CartDataSource implements CartRepository {

    // TODO データベース実装に切り替える
    Map<CartIdentifier, CartItems> cache = new HashMap<>();

    @Override
    public CartIdentifier create() {
        CartIdentifier cartIdentifier = new CartIdentifier(UUID.randomUUID().toString());
        cache.put(cartIdentifier, CartItems.empty());
        return cartIdentifier;
    }

    @Override
    public CartItems find(CartIdentifier cartIdentifier) {
        return cache.getOrDefault(cartIdentifier, CartItems.empty());
    }

    @Override
    public CartItem find(CartIdentifier cartIdentifier, Product product) {
        CartItems cartItems = cache.get(cartIdentifier);
        return cartItems.get(product);
    }

    @Override
    public void update(CartIdentifier cartIdentifier, CartItem cartItem) {
        CartItems cartItems = cache.get(cartIdentifier);
        CartItems cartItemsAfterUpdate = cartItems.update(cartItem);
        cache.put(cartIdentifier, cartItemsAfterUpdate);
    }

}
