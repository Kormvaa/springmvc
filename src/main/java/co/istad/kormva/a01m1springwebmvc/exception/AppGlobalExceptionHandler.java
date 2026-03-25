package co.istad.kormva.a01m1springwebmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class AppGlobalExceptionHandler {


    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<RestErrorResponse> handleService(ResponseStatusException e) {
        RestErrorResponse restErrorResponse = RestErrorResponse.builder()
                .message("Business logic error, please check")
                .code(e.getStatusCode().value())
                .status(e.getStatusCode().toString())
                .timeStamp(Instant.now())
                .errorDetail(e.getReason())
                .build();
        return new ResponseEntity<>(restErrorResponse,
                e.getStatusCode());
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RestErrorResponse handleValidation(MethodArgumentNotValidException e) {

        List<FieldResponse> fields = new ArrayList<>();

        e.getFieldErrors()
                .forEach(fieldError -> {
                    fields.add(new FieldResponse(fieldError.getField(),
                            fieldError.getDefaultMessage()));
                });

        return RestErrorResponse.builder()
                .message("Requested data is invalid")
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .timeStamp(Instant.now())
                .errorDetail(fields)
                .build();
    }

}