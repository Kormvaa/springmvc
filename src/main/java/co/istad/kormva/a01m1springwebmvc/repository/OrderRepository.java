package co.istad.kormva.a01m1springwebmvc.repository;

import co.istad.kormva.a01m1springwebmvc.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends
        JpaRepository<Order, UUID> {
}
