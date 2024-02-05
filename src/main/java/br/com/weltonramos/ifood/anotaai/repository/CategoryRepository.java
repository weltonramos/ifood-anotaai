package br.com.weltonramos.ifood.anotaai.repository;

import br.com.weltonramos.ifood.anotaai.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CategoryRepository extends MongoRepository<Category, BigInteger> {

}
