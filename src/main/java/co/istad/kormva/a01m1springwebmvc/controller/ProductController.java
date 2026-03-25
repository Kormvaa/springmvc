package co.istad.kormva.a01m1springwebmvc.controller;

import co.istad.kormva.a01m1springwebmvc.dto.CreateProductRequest;
import co.istad.kormva.a01m1springwebmvc.dto.ProductDto;
import co.istad.kormva.a01m1springwebmvc.dto.ProductResponse;
import co.istad.kormva.a01m1springwebmvc.dto.UpdateProductRequest;
import co.istad.kormva.a01m1springwebmvc.service.ProductService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PatchMapping("/{code}")
    public ProductResponse patchByCode(
            @PathVariable String code,
            @RequestBody
            ProductDto productDto
    ) {
        log.info("patchByCode: {}, newData: {}",
                code,
                productDto);
        return null;
    }

    @PutMapping("/{code}")
    public ProductResponse updateByCode(
            @PathVariable String code,
            @RequestBody
            UpdateProductRequest updateProductRequest
    ) {
        log.info("updateByCode: {}, newData: {}",
                code,
                updateProductRequest);
        return null;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{code}")
    public void deleteByCode(@PathVariable String code) {
        log.info("deleteByCode: {}", code);
        throw new RuntimeException("Something went wrong");
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ProductResponse createNew(
            @Valid @RequestBody
            CreateProductRequest createProductRequest
    ) {
        log.info("createNew: {}", createProductRequest);
        return productService.createNew(createProductRequest);
    }

    @GetMapping("/{code}")
    public ProductResponse getByCode(@PathVariable String code) {
        log.info("getByCode: {}", code);
        return null;
    }

    @GetMapping
    public Page<ProductResponse> getAll(
            @RequestParam(required = false, defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "20") int pageSize
    ) {
        log.info("getAll with pageNumber: {} and pageSize: {}", pageNumber, pageSize);
        return productService.getAll(pageNumber, pageSize);
    }

}
