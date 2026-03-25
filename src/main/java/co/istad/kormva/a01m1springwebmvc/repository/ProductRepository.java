package co.istad.kormva.a01m1springwebmvc.repository;

import co.istad.kormva.a01m1springwebmvc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends
        JpaRepository<Product,String> {
}
