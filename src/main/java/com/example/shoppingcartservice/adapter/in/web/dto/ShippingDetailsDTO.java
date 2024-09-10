package com.example.shoppingcartservice.adapter.in.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingDetailsDTO {

    @NotBlank(message = "{shipping.address.notblank}")
    private String shippingAddress;

    @NotBlank(message = "{shipping.method.notblank}")
    private String shippingMethod;
    private Date estimatedDeliveryDate;

    @PositiveOrZero(message = "{shipping.cost.positiveorzero}")
    private BigDecimal shippingCost;
}