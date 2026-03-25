package co.istad.kormva.a01m1springwebmvc.repository;

import co.istad.kormva.a01m1springwebmvc.domain.OrderLine;
import org.springframework.data.repository.CrudRepository;

public interface OrderLineRepository extends
        CrudRepository<OrderLine,Integer> {

}
