package com.example.shoppingcartservice.core.model;

public enum CartStatus {
    ACTIVE,       // The cart is being used by the user
    INACTIVE,     // The cart is no longer being used but not abandoned
    ABANDONED,    // The user left the cart without completing checkout
    CHECKED_OUT   // The cart was used to complete a purchase
}
