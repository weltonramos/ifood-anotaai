package br.com.weltonramos.ifood.anotaai.domain.category;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "categories")
public class Category {

    @Id
    private BigInteger id;
    private String title;
    private String description;
    private Long ownerID;

    public Category(CategoryDto categoryDto) {
        this.title = categoryDto.title();
        this.description = categoryDto.description();
        this.ownerID = categoryDto.ownerID();
    }
}
