package com.example.shoppingcartservice.adapter.in.web.dto;

import com.example.shoppingcartservice.core.CartItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {
    private String cartId;
    private String userId;       // For logged-in users
    // private String sessionId;    // For guest users
    private List<CartItemDTO> cartItems;
    private double subtotal;
    private double shippingCost;
    private double taxes;
    private double discountAmount;
    private double grandTotal;
    private List<CouponDTO> coupons;
    private ShippingDetailsDTO shippingDetails;
    private BillingDetailsDTO billingDetails;
    private CartStatus status;
    private Date expirationDate;
    private List<String> wishlist; // Wishlist - product IDs or names
    private String currency;
    private String taxRegion;
    private String additionalNotes; // Any additional comments or requests added by the user (e.g., gift wrap requests, special delivery instructions)
}
