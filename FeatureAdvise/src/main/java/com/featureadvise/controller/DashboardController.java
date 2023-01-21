package com.featureadvise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.featureadvise.domain.Product;
import com.featureadvise.domain.User;
import com.featureadvise.repository.ProductRepository;

@Controller
public class DashboardController {
 
  @Autowired
  private ProductRepository productRepo;
  
  @GetMapping("/")
  public String rootView () {
    return "index";
  }
  
  @GetMapping("/dashboard")
  public String dashboard(@AuthenticationPrincipal User user, ModelMap model) {
    List<Product> products = productRepo.findByUser(user);
    
    model.put("products", products);
    
    return "dashboard";
  }
}
