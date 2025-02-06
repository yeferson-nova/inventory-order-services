package com.ynova.service_inventory.model.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table("products")
public class ProductsModel {
    @Id
    private int id;
    private String code;
    @Column("nameProduct")
    private String nameProduct;
    private int stock;
    private BigDecimal price;
}
