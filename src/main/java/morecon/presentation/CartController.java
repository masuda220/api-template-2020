package morecon.presentation;

import morecon.application.service.ProductQueryService;
import morecon.application.service.cart.CartQueryService;
import morecon.application.service.cart.CartRecordService;
import morecon.domain.indentifier.ProductId;
import morecon.domain.model.cart.CartIdentifier;
import morecon.domain.model.cart.CartItems;
import morecon.domain.model.product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.Optional;

/**
 * ショッピングカート
 */
@Controller
@RequestMapping("cart")
@SessionAttributes("scopedTarget.cartIdStore")
public class CartController {

    CartIdStore cartIdStore;

    CartQueryService cartQueryService;

    CartRecordService cartRecordService;

    ProductQueryService productQueryService;

    public CartController(CartIdStore cartIdStore, CartQueryService cartQueryService, CartRecordService cartRecordService, ProductQueryService productQueryService) {
        this.cartIdStore = cartIdStore;
        this.cartQueryService = cartQueryService;
        this.cartRecordService = cartRecordService;
        this.productQueryService = productQueryService;
    }

    @GetMapping
    public String show(Model model) {
        CartIdentifier cartIdentifier = getCartId();
        CartItems cartItems = cartQueryService.find(cartIdentifier);
        model.addAttribute("cartItems", cartItems);
        return "cart/list";
    }

    @PostMapping("add")
    public String add(Model model, @RequestParam("productNumber") ProductId productId) {
        CartIdentifier cartIdentifier = getCartId();
        Product product = productQueryService.find(productId);
        cartRecordService.add(cartIdentifier, product);

        return "redirect:" + MvcUriComponentsBuilder.fromController(CartController.class).toUriString();
    }

    private CartIdentifier getCartId() {
        Optional<CartIdentifier> cartIdentifier = cartIdStore.getCartIdentifier();
        return cartIdentifier.orElseGet(this::createCart);
    }

    private CartIdentifier createCart() {
        CartIdentifier cartIdentifier = cartRecordService.create();
        cartIdStore.setCartIdentifier(cartIdentifier);
        return cartIdentifier;
    }

    @PostMapping("reset")
    String reset(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:" + MvcUriComponentsBuilder.fromController(CartController.class).toUriString();
    }
}
