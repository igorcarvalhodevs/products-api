package com.igor.products_api.dto;

public class UpdateProductRequest {

    private String name;
    private String description;
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

