package com.gcu.ecommerce.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gcu.ecommerce.models.ProductModel;

/**
 * ProductBusinessService manages product business logic.
 * Products are stored in memory 
 */
@Service
public class ProductBusinessService {

    private final List<ProductModel> products = new ArrayList<>();

    /**
     * Loads sample products into memory.
     */
    public ProductBusinessService() {
        products.add(new ProductModel(1, "Smartphone", "Electronics", 699.99, 12,
                "Modern smartphone with large display."));
        products.add(new ProductModel(2, "Hoodie", "Clothing", 49.99, 25,
                "Comfortable everyday hoodie."));
        products.add(new ProductModel(3, "Dumbbell Set", "Fitness Gear", 89.99, 8,
                "Adjustable dumbbell set for home workouts."));
    }

    /**
     * Returns all products.
     *
     * @return product list
     */
    public List<ProductModel> getProducts() {
        return products;
    }

    /**
     * Adds a product to the in memory product list.
     *
     * @param productModel product submitted from the form
     */
    public void addProduct(ProductModel productModel) {
        int newId = products.size() + 1;
        productModel.setId(newId);
        products.add(productModel);
    }
}