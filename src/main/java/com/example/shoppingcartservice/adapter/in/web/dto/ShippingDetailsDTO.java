package com.example.shoppingcartservice.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingDetailsDTO {
    private String shippingAddress;
    private String shippingMethod;
    private Date estimatedDeliveryDate;
    private double shippingCost;
}
