package br.com.weltonramos.ifood.anotaai.controller;

import br.com.weltonramos.ifood.anotaai.domain.category.Category;
import br.com.weltonramos.ifood.anotaai.domain.category.CategoryDto;
import br.com.weltonramos.ifood.anotaai.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<BigInteger> create(@RequestBody CategoryDto categoryDto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(categoryService.create(categoryDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getById(@PathVariable("id") BigInteger id) {
        return ResponseEntity.ok(categoryService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") BigInteger id, @RequestBody CategoryDto categoryDto) {
        categoryService.update(id, categoryDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") BigInteger id) {
        categoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
