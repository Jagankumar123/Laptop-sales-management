package com.laptop.laptop_sales_management.Service;

import com.laptop.laptop_sales_management.Model.Sales;
import com.laptop.laptop_sales_management.Repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    public Sales save(Sales sales){
        return salesRepository.save(sales);
    }

    public List<Sales> findAllSales(){
        return salesRepository.findAll();
    }
}
