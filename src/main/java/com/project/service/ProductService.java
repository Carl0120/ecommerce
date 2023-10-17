package com.project.service;

import com.project.model.entity.ProductEntity;
import com.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IBaseService<ProductEntity,Integer> {
   @Autowired
   private ProductRepository productRepository;

    @Override
    public ProductEntity save(ProductEntity element) {
        return productRepository.save(element);
    }

    @Override
    public ProductEntity update(ProductEntity element) {
         return productRepository.save(element);
    }

    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity get(Integer id) {
        return productRepository.getById(id);
    }

    @Override
    public boolean remove(Integer id) {
         productRepository.deleteById(id);
         return true;

    }
}
