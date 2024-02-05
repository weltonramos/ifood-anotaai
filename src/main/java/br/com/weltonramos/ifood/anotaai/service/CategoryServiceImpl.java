package br.com.weltonramos.ifood.anotaai.service;

import br.com.weltonramos.ifood.anotaai.domain.category.Category;
import br.com.weltonramos.ifood.anotaai.domain.category.CategoryDto;
import br.com.weltonramos.ifood.anotaai.exceptions.CategoryNotFoundException;
import br.com.weltonramos.ifood.anotaai.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public BigInteger create(CategoryDto categoryDto) {
        Category category = new Category(categoryDto);
        return this.categoryRepository.save(category).getId();
    }

    @Override
    public Category getById(BigInteger id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Cannot find Category with ID " + id));
    }

    @Override
    public void update(BigInteger id, CategoryDto categoryDto) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Cannot find Category with ID " + id));

        category.setTitle(categoryDto.title() != null ? categoryDto.title() : category.getTitle());
        category.setDescription(categoryDto.description() != null ? categoryDto.description() : category.getDescription());
        category.setOwnerID(categoryDto.ownerID() != null ? categoryDto.ownerID() : category.getOwnerID());

        categoryRepository.save(category);
    }

    @Override
    public void deleteById(BigInteger id) {
        if (categoryRepository.findById(id).isPresent())
            categoryRepository.deleteById(id);
    }
}
