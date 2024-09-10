package com.example.shoppingcartservice.core;

public class CartItem {
    private String productId;  // Unique identifier for the product
    private int quantity;      // Quantity of the product in the cart
    private double price;      // Price of a single unit of the product

    public double getTotalPrice() {
        return price * quantity;
    }
}
