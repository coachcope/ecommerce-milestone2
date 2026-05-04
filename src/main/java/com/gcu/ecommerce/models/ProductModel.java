package com.gcu.ecommerce.models;
/** Represents a sample product for Milestone 2. */
public class ProductModel {
 private int id; private String name, category, description; private double price; private int quantityInStock;
 public ProductModel(int id,String name,String category,double price,int quantityInStock,String description)
 {this.id=id;this.name=name;this.category=category;this.price=price;this.quantityInStock=quantityInStock;this.description=description;}
 public int getId(){return id;} public String getName(){return name;} public String getCategory(){return category;}
 public double getPrice(){return price;} public int getQuantityInStock(){return quantityInStock;} public String getDescription(){return description;}
}
