package morecon.presentation;

import morecon.application.service.cart.CartQueryService;
import morecon.domain.model.cart.CartIdentifier;
import morecon.domain.model.cart.CartItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * 注文
 */
@Controller("注文")
@RequestMapping("order")
public class OrderController {

    CartIdStore cartIdStore;
    CartQueryService cartQueryService;

    public OrderController(CartIdStore cartIdStore, CartQueryService cartQueryService) {
        this.cartIdStore = cartIdStore;
        this.cartQueryService = cartQueryService;
    }

    @GetMapping("confirm")
    String confirm(Model model) {
        Optional<CartIdentifier> cartIdentifier = cartIdStore.getCartIdentifier();
        CartItems cartItems = cartQueryService.find(cartIdentifier.orElseThrow());
        model.addAttribute("cartItems", cartItems);
        return "order/confirm";
    }
}
