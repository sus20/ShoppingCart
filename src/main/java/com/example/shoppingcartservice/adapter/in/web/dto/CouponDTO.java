package com.example.shoppingcartservice.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponDTO {
    private String couponCode;
    private double discountAmount;
    private String discountType; // Percentage or Flat-rate
}
