package br.com.weltonramos.ifood.anotaai.service;

import br.com.weltonramos.ifood.anotaai.domain.category.Category;
import br.com.weltonramos.ifood.anotaai.domain.category.CategoryDto;

import java.math.BigInteger;

public interface CategoryService {
    BigInteger create(CategoryDto categoryDto);

    Category getById(BigInteger id);

    void update(BigInteger id, CategoryDto categoryDto);

    void deleteById(BigInteger id);
}
