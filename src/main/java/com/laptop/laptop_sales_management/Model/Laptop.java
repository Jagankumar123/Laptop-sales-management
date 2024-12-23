package com.laptop.laptop_sales_management.Model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brandName;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private int stockQuantity;

    @Column(nullable = false)
    private double price;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date createdDate;


}
