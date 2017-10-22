package com.my.db;

public class Orders {
  private Long id;
  private Long account_id;
  private Long total;
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

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
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
