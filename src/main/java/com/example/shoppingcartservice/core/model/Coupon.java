package com.example.shoppingcartservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    private String couponCode;
    private double discountAmount;
    private String discountType; // Percentage or Flat-rate
}
