package com.my.db;

public class ItemPrice {
  private Long id;
  private Long item_id;
  private Long price;
  private Long include_tax;
  private java.sql.Timestamp created_at;
  private java.sql.Timestamp updated_at;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getItem_id() {
    return item_id;
  }

  public void setItem_id(Long item_id) {
    this.item_id = item_id;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getInclude_tax() {
    return include_tax;
  }

  public void setInclude_tax(Long include_tax) {
    this.include_tax = include_tax;
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
