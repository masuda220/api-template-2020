package morecon.application.service.cart;

import morecon.application.repository.CartRepository;
import morecon.application.repository.product.ProductRepository;
import morecon.domain.model.cart.CartIdentifier;
import morecon.domain.model.cart.CartItems;
import org.springframework.stereotype.Service;

/**
 * ショッピングカート検索サービス
 */
@Service
public class CartQueryService {

    CartRepository cartRepository;

    ProductRepository productRepository;

    public CartQueryService(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    public CartItems find(CartIdentifier cartIdentifier) {
        return cartRepository.find(cartIdentifier);
    }
}
