package br.com.weltonramos.ifood.anotaai.service;

import br.com.weltonramos.ifood.anotaai.domain.product.ProductDto;
import br.com.weltonramos.ifood.anotaai.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Long create(ProductDto productDto) {
        return null;
    }
}
