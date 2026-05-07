package com.gcu.ecommerce.models;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ProductModel is the product in the e-commerce application.
 * This model is for  product creation form and catalog page.
 */
public class ProductModel {

    private int id;

    @NotBlank(message = "Product name is required.")
    @Size(min = 2, max = 50, message = "Product name must be between 2 and 50 characters.")
    private String name;

    @NotBlank(message = "Category is required.")
    private String category;

    @DecimalMin(value = "0.01", message = "Price must be greater than 0.")
    private double price;

    @Min(value = 0, message = "Quantity cannot be negative.")
    private int quantityInStock;

    @NotBlank(message = "Description is required.")
    @Size(min = 5, max = 200, message = "Description must be between 5 and 200 characters.")
    private String description;

    public ProductModel() {
    }

    public ProductModel(int id, String name, String category, double price, int quantityInStock, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}