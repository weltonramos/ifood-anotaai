package br.com.weltonramos.ifood.anotaai.repository;

import br.com.weltonramos.ifood.anotaai.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ProductRepository extends MongoRepository<Product, BigInteger> {

}
