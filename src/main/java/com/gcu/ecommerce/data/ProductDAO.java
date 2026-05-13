package com.gcu.ecommerce.data;

import java.util.List;
import com.gcu.ecommerce.models.ProductModel;

public interface ProductDAO {
    List<ProductModel> findAll();
    int create(ProductModel product);
}