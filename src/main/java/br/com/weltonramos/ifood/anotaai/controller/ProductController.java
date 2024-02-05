package br.com.weltonramos.ifood.anotaai.controller;

import br.com.weltonramos.ifood.anotaai.domain.product.ProductDto;
import br.com.weltonramos.ifood.anotaai.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Long> createProduct(@RequestBody ProductDto productDto) {
        productService.create(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(productDto));
    }
}
