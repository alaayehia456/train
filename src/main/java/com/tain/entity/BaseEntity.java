package com.tain.entity;

import jakarta.persistence.*;

@Table
@Entity
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
