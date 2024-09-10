package com.example.shoppingcartservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    private String productId;
    private String productName;
    private String productImage;
    private String productDescription;
    private int quantity;
    private double unitPrice;
    private double totalPrice; // quantity * unitPrice
    private boolean inStock;
    private boolean backOrder;
}
