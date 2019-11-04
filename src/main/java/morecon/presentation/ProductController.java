package morecon.presentation;

import morecon.application.service.ProductQueryService;
import morecon.domain.indentifier.ProductId;
import morecon.domain.model.product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品の詳細
 */
@Controller
@RequestMapping("products/{id}")
public class ProductController {

    ProductQueryService productQueryService;

    public ProductController(ProductQueryService productQueryService) {
        this.productQueryService = productQueryService;
    }

    @ModelAttribute("product")
    Product product(@PathVariable(value = "id") ProductId productId) {
        return productQueryService.find(productId);
    }

    @GetMapping
    String detail() {
        return "product/detail";
    }

}
