package com.igor.products_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CreateProductRequest {

    @NotBlank(message = "name must not be blank")
    @Size(max = 255, message = "name must have at most 255 characters")
    private String name;

    @Size(max = 500, message = "description must have at most 500 characters")
    private String description;

    @NotNull(message = "priceCents is required")
    @Positive(message = "priceCents must be greater than 0")
    private Long priceCents;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getPriceCents() {
        return priceCents;
    }
}
