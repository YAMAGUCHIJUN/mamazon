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
@Table(name="shopping_carts")
@Data
public class ShoppingCarts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  @SequenceGenerator(name = "shopping_carts_id_seq", sequenceName = "shopping_carts_id_seq", allocationSize = 1)
  private Long id;

  @Column(name="account_id")
  private Long accountId;

  @Column(name="item_id")
  private Long itemId;

  @Column(name="quentity")
  private Long quentity;

  @Column(name="sub_total")
  private Long subTotal;

  @Column(name="createdAt")
  private java.sql.Timestamp created_at;

  @Column(name="updatedAt")
  private java.sql.Timestamp updated_at;

}
