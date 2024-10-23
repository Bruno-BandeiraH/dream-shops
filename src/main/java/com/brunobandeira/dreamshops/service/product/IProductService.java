package com.brunobandeira.dreamshops.service.product;

import com.brunobandeira.dreamshops.model.Product;
import com.brunobandeira.dreamshops.request.AddProductRequest;
import com.brunobandeira.dreamshops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product getProductById(Long id);
    Product addProduct(AddProductRequest product);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    void deleteById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);


}
