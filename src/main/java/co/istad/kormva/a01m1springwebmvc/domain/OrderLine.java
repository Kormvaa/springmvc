package co.istad.kormva.a01m1springwebmvc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "order_Lines")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // association mapping with order
    @ManyToOne
    private Order order;

    // association mapping with product
    @ManyToOne
    private Product product;

    private Integer qty;
    private BigDecimal uniPrice;
    private Float discount;

}