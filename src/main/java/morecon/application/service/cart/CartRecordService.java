package morecon.application.service.cart;

import morecon.application.repository.CartRepository;
import morecon.domain.model.cart.CartIdentifier;
import morecon.domain.model.cart.CartItem;
import morecon.domain.model.cart.Quantity;
import morecon.domain.model.product.Product;
import org.springframework.stereotype.Service;

/**
 * ショッピングカート更新サービス
 */
@Service
public class CartRecordService {

    CartRepository cartRepository;

    public CartRecordService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public CartIdentifier create() {
        return cartRepository.create();
    }

    public void add(CartIdentifier cartIdentifier, Product product) {
        CartItem cartItem = cartRepository.find(cartIdentifier, product);
        CartItem cartItemAfterAdd = cartItem.plus(Quantity.ONE);
        cartRepository.update(cartIdentifier, cartItemAfterAdd);
    }

    public void update(CartIdentifier cartIdentifier, Product product, Quantity quantity) {
        CartItem cartItem = cartRepository.find(cartIdentifier, product);
        CartItem cartItemAfterUpdate = cartItem.update(quantity);
        cartRepository.update(cartIdentifier, cartItemAfterUpdate);
    }
}
