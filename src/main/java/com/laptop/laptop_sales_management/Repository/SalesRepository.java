package com.laptop.laptop_sales_management.Repository;

import com.laptop.laptop_sales_management.Model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {
}
