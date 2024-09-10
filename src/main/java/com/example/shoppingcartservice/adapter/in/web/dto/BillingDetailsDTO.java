package com.example.shoppingcartservice.adapter.in.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillingDetailsDTO {

    @NotBlank(message = "{billing.address.notblank}")
    private String billingAddress;

    @NotBlank(message = "{payment.method.notblank}")
    @Pattern(regexp = "Credit Card|Debit Card|PayPal", message = "{payment.method.invalid}")
    private String paymentMethod;
}
