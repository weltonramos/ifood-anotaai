package br.com.weltonramos.ifood.anotaai.service;

import br.com.weltonramos.ifood.anotaai.domain.product.ProductDto;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Long create(ProductDto productDto);
}
