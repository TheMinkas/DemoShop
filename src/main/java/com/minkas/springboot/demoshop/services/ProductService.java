package com.minkas.springboot.demoshop.services;

import com.minkas.springboot.demoshop.dao.ProductsDAO;
import com.minkas.springboot.demoshop.entity.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl {

    private ProductsDAO productsDAO;

    public List<Product> getAllProducts(String title) {
        List<Product> products = productsDAO.findAll();
        if (title !=null) productsDAO.findProductByTitle(title);
        return productsDAO.findAll();
    }

    public void saveProduct(Product product) {
        log.info("Saving new {}", product);
        productsDAO.save(product);
    }
    public void deleteProduct(long article) {
        productsDAO.deleteById(article);
    }

    public Product getProductByArticle(Long article) {
        return productsDAO.findById(article).orElse(null);
    }
}
