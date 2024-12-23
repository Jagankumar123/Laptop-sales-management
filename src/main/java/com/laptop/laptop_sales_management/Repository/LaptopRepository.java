package com.laptop.laptop_sales_management.Repository;

import com.laptop.laptop_sales_management.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
