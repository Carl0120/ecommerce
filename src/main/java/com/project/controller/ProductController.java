package com.project.controller;

import com.project.Util.Routes;
import com.project.model.entity.ProductEntity;
import com.project.model.entity.TypeProduct;
import com.project.model.entity.UserEntity;
import com.project.service.ProductService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@RestController
@RequestMapping("product")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;
    @GetMapping("")
    public ModelAndView show(){
        List<ProductEntity> products = productService.getAll();
        ModelAndView view = new ModelAndView(Routes.PRODUCT_SHOW);
        view.addObject("products",products);
        return view;
    }
    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView view = new ModelAndView(Routes.PRODUCT_CREATE);
        view.addObject("product",new ProductEntity());
        return view;
    }
    @PostMapping("/add")
    public RedirectView save(@ModelAttribute("product") ProductEntity product){
        UserEntity user = new UserEntity();
        user.setId(1);
        product.setUser(user);
        TypeProduct type = new TypeProduct();
        type.setId(1);
        product.setType(type);
       productService.save(product);
       RedirectView redirect = new RedirectView("/product",true);
       return redirect;
    }
}
