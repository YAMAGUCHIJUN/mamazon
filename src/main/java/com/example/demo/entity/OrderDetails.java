package com.my.db;

public class OrderDetails {
  private Long id;
  private Long order_id;
  private Long item_id;
  private Long quantity;
  private java.sql.Timestamp created_at;
  private java.sql.Timestamp updated_at;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOrder_id() {
    return order_id;
  }

  public void setOrder_id(Long order_id) {
    this.order_id = order_id;
  }

  public Long getItem_id() {
    return item_id;
  }

  public void setItem_id(Long item_id) {
    this.item_id = item_id;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public java.sql.Timestamp getCreated_at() {
    return created_at;
  }

  public void setCreated_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }

  public java.sql.Timestamp getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
  }
}
