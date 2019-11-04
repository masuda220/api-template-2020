package morecon.presentation;

import morecon.application.service.ProductQueryService;
import morecon.domain.model.product.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品の一覧
 */
@Controller
@RequestMapping("products")
public class ProductsController {

    ProductQueryService productQueryService;

    public ProductsController(ProductQueryService productQueryService) {
        this.productQueryService = productQueryService;
    }

    @GetMapping
    String all(Model model) {
        Products products = productQueryService.all();
        model.addAttribute("products", products);
        return "product/list";
    }
}
