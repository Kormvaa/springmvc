package co.istad.kormva.a01m1springwebmvc.dto;

import lombok.Builder;

import java.math.BigDecimal;
@Builder
public record ProductDto(
        String code,
        String name,
        String description,
        BigDecimal price,
        String picture,
        Boolean isAvailable

) {

}
