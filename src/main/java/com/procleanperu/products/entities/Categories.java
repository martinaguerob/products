package com.procleanperu.products.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    private String name;
    private String idType; //one to many
    private Integer order;
    private Boolean status;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date updateAt;

}
