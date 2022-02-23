package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity {

    private LocalDateTime registAt;
    private String register;
}
