package com.my.db;

public class ShoppingCarts {
  private Long id;
  private Long account_id;
  private Long item_id;
  private Long quentity;
  private Long sub_total;
  private java.sql.Timestamp created_at;
  private java.sql.Timestamp updated_at;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAccount_id() {
    return account_id;
  }

  public void setAccount_id(Long account_id) {
    this.account_id = account_id;
  }

  public Long getItem_id() {
    return item_id;
  }

  public void setItem_id(Long item_id) {
    this.item_id = item_id;
  }

  public Long getQuentity() {
    return quentity;
  }

  public void setQuentity(Long quentity) {
    this.quentity = quentity;
  }

  public Long getSub_total() {
    return sub_total;
  }

  public void setSub_total(Long sub_total) {
    this.sub_total = sub_total;
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