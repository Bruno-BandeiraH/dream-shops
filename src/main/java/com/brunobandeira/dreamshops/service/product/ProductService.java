package com.brunobandeira.dreamshops.service.product;

import com.brunobandeira.dreamshops.exceptions.ProductNotFoundException;
import com.brunobandeira.dreamshops.model.Product;
import com.brunobandeira.dreamshops.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
            .orElseThrow(()-> new ProductNotFoundException("Product not found!"));
    }

    @Override
    public void deleteById(Long id) {
        productRepository.findById(id)
            .ifPresentOrElse(productRepository::delete,
                () -> {throw new ProductNotFoundException("ProductNot found!");});
    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryNameAndBrand(category, brand);
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return null;
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return null;
    }
}
