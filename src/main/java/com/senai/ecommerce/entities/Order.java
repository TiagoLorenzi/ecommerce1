package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tb_order")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Timestamp moment;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

