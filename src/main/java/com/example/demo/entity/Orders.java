package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
@Data
public class Orders {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  @SequenceGenerator(name = "orders_id_seq", sequenceName = "orders_id_seq", allocationSize = 1)
  private Long id;

  @Column(name="account_id")
  private Long accountId;

  @Column(name="total")
  private Long total;

  @Column(name="sub_total")
  private Long subTotal;

  @Column(name="created_at")
  private java.sql.Timestamp createdAt;

  @Column(name="updated_at")
  private java.sql.Timestamp updatedAt;
}