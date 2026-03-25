package co.istad.kormva.a01m1springwebmvc.repository;

import co.istad.kormva.a01m1springwebmvc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends
        JpaRepository<Category,String> {

}
