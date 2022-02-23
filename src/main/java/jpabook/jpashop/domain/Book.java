package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@DiscriminatorValue("Book")
public class Book extends Item{

    @Id
    @GeneratedValue
    private Long id;

    private String author;
    private String isbn;
}
