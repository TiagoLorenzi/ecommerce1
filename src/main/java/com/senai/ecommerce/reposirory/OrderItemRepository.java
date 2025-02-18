package com.senai.ecommerce.reposirory;

import com.senai.ecommerce.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
