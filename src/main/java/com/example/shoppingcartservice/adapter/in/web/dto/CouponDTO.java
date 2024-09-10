package com.example.shoppingcartservice.adapter.in.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponDTO {

    @NotBlank(message = "{coupon.code.notblank}")
    private String couponCode;

    @Positive(message = "{discount.amount.positive}")
    private BigDecimal discountAmount;

    @NotBlank(message = "{discount.type.notblank}")
    private String discountType; // Percentage or Flat-rate
}