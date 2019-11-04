package morecon.domain.model.cart;

import morecon.domain.model.product.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * ショッピングカート内の商品一覧
 */
public class CartItems {

    List<CartItem> list;

    public CartItems(List<CartItem> list) {
        this.list = list;
    }

    public static CartItems empty() {
        return new CartItems(Collections.emptyList());
    }

    public List<CartItem> list() {
        return list.stream()
                .sorted(Comparator.comparing(cartItem -> cartItem.product.id().toString()))
                .collect(Collectors.toList());
    }

    public CartItem get(Product product) {
        return list.stream().filter(v -> v.is(product)).findFirst().orElse(new CartItem(product, Quantity.ZERO));
    }

    public CartItems update(CartItem cartItem) {
        if (list.stream().anyMatch(item -> item.is(cartItem.product()))) {
            return new CartItems(list.stream().map(v -> v.is(cartItem.product()) ? cartItem : v).collect(toList()));
        } else {
            return new CartItems(Stream.concat(list.stream(), Stream.of(cartItem)).collect(toList()));
        }
    }
}
