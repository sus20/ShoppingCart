package com.example.shoppingcartservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingDetails {
    private String shippingAddress;
    private String shippingMethod;
    private Date estimatedDeliveryDate;
    private double shippingCost;
}
