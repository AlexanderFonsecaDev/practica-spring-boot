package co.com.practica.spring.boot.domain;

import lombok.Data;

@Data
public class Category {

    private int categoryId;
    private String category;
    private boolean active;

}
