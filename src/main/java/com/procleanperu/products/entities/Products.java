package com.procleanperu.products.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    private String name;
    private String search;
    private String description;
    private String image;
    private Integer order;
    private Boolean status;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date updateAt;

}
