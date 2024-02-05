package br.com.weltonramos.ifood.anotaai.domain.product;

import br.com.weltonramos.ifood.anotaai.domain.category.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {

    @Id
    private BigInteger id;
    private String title;
    private String description;
    private Integer price;
    private Category category;
    private String ownerID;

    public Product(ProductDto productDto) {
        this.title = productDto.title();
        this.description = productDto.description();
        this.price = productDto.price();
        this.category = productDto.category();
        this.ownerID = productDto.ownerID();
    }
}
