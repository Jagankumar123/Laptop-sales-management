package com.laptop.laptop_sales_management.Controllers;

import com.laptop.laptop_sales_management.Model.Laptop;
import com.laptop.laptop_sales_management.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping("/laptops-form")
    public String listLaptops(Model model){
        model.addAllAttributes( laptopService.findAll());
        return "laptop/list";
    }

    @PostMapping("/save-laptop")
    public String saveLaptop(@RequestBody Laptop laptop){
        laptopService.save(laptop);
        return "Laptop saved successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLaptop(@PathVariable("id") Long id){
        laptopService.deleteLaptopById(id);
        return "Laptop deleted successfully";
    }




}
