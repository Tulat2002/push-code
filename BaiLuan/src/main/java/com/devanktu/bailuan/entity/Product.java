package com.devanktu.bailuan.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "prduct")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    private String description;

}
