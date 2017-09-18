package by.bigroi.wear.controller;

import by.bigroi.wear.model.catalog.Catalog;
import by.bigroi.wear.model.product.Product;
import by.bigroi.wear.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    String productsList(Model model, @RequestBody Catalog catalog){
        System.out.println("in controller " + catalog.getCollection() + catalog.getName());
        List<Product> productsList = productService.getProductsFromCatalogAndCollection(catalog.getCollection(), catalog.getName());
        model.addAttribute("productsList", productsList);
        return "products";
    }
}
