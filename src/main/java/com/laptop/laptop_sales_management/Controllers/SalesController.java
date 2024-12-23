package com.laptop.laptop_sales_management.Controllers;

import com.laptop.laptop_sales_management.Model.Sales;
import com.laptop.laptop_sales_management.Service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/laptops-form")
    public String listSales(Model model){
        model.addAllAttributes(salesService.findAllSales());
        return "sales/list";
    }


    @PostMapping("/save-laptop")
    public String saveSales(Sales sales){
        salesService.save(sales);
        return "redirect:/sales";
    }
}
