package co.istad.kormva.a01m1springwebmvc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record CreateProductRequest(

        @NotBlank(message = "Name is Required")
        @Size(max = 150)
        String name,

        String description,

        @NotNull
        @Positive
        BigDecimal price,

        @Size(max = 255)
        String picture,

        @NotBlank(message = "Category is required")
        @Size(max = 255)
        String categoryId

) {
}
