package co.istad.kormva.a01m1springwebmvc.service;

import co.istad.kormva.a01m1springwebmvc.dto.CreateProductRequest;
import co.istad.kormva.a01m1springwebmvc.dto.ProductResponse;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<ProductResponse> getAll(int pageNumber, int pageSize);

    ProductResponse createNew(CreateProductRequest createProductRequest);

}

