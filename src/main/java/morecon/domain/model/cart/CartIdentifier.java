package morecon.domain.model.cart;

import java.util.Objects;

/**
 * ショッピングカートID
 */
public class CartIdentifier {

    String value;

    public CartIdentifier(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals((((CartIdentifier) obj).value));
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
