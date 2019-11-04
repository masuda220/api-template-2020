package morecon.presentation;

import morecon.domain.model.cart.CartIdentifier;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;
import java.util.Optional;

@Component
@SessionScope
public class CartIdStore implements Serializable {

    String cartIdentifierValue;

    public Optional<CartIdentifier> getCartIdentifier() {
        return Optional.ofNullable(cartIdentifierValue).map(CartIdentifier::new);
    }

    public void setCartIdentifier(CartIdentifier cartIdentifier) {
        this.cartIdentifierValue = cartIdentifier.toString();
    }
}
