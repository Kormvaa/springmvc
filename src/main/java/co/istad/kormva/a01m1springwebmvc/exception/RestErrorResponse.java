package co.istad.kormva.a01m1springwebmvc.exception;

import lombok.Builder;

import java.time.Instant;
@Builder
public record RestErrorResponse(
        String message,
        Integer code,
        String status,
        Instant timeStamp,
        Object errorDetail

) {
}
