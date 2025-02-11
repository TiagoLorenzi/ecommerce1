package com.senai.ecommerce.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK {
   @ManyToOne
   @JoinColumn(name = "product_id")
   private Product product;

   @ManyToOne
   @JoinColumn(name = "order_id")
   private Order order;

}
