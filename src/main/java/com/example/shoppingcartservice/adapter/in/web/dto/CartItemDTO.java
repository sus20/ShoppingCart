package com.example.shoppingcartservice.adapter.in.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    @NotBlank(message = "{product.id.notblank}")
    private String productId;

    @NotBlank(message = "{product.name.notblank}")
    private String productName;

    @NotBlank(message = "{product.image.notblank}")
    private String productImage;

    @NotBlank(message = "{product.description.notblank}")
    private String productDescription;

    @PositiveOrZero(message = "{quantity.positiveorzero}")
    private int quantity;

    @Positive(message = "{unit.price.positive}")
    private BigDecimal unitPrice;

    @PositiveOrZero(message = "{total.price.positiveorzero}")
    private BigDecimal totalPrice; // quantity * unitPrice

    private boolean inStock;
    private boolean backOrder;
}