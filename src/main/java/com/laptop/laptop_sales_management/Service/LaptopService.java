package com.laptop.laptop_sales_management.Service;

import com.laptop.laptop_sales_management.Model.Laptop;
import com.laptop.laptop_sales_management.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public Laptop save(Laptop laptop){
        return laptopRepository.save(laptop);
    }

    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    public Laptop findLaptopById(Long id){
        return laptopRepository.findById(id).orElse(null);
    }

    public void  deleteLaptopById(Long id){
       laptopRepository.deleteById(id);
    }

    public Laptop updateLaptop(Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
