package com.example.shoppingcartservice.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillingDetailsDTO {
    private String billingAddress;
    private String paymentMethod;
}
