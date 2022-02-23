package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@DiscriminatorValue("Movie")
public class Movie extends Item {

    @Id @GeneratedValue
    private Long id;

    private String director;
    private String actor;
}
