package com.procleanperu.products.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "types")
public class Types {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    private String name; //Maquinaria, quimico y accesorio
    private String image;
    private Boolean status;
    private Integer order;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date updateAt;
}
