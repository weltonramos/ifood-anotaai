package br.com.weltonramos.ifood.anotaai.domain.product;

import br.com.weltonramos.ifood.anotaai.domain.category.Category;

public record ProductDto(String title, String description, Integer price, Category category, String ownerID) {
}
