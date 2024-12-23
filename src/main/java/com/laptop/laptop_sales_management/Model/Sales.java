package com.laptop.laptop_sales_management.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "laptop_id", nullable = false)
    private Laptop laptop;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double salesPrice;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date SaleDate;
}
