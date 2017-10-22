package com.my.db;

public class Items {
  private Long id;
  private String name;
  private Long category_id;
  private java.sql.Timestamp sale_start;
  private java.sql.Timestamp sale_end;
  private java.sql.Timestamp created_at;
  private java.sql.Timestamp updated_at;
  private String id_deleted;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getCategory_id() {
    return category_id;
  }

  public void setCategory_id(Long category_id) {
    this.category_id = category_id;
  }

  public java.sql.Timestamp getSale_start() {
    return sale_start;
  }

  public void setSale_start(java.sql.Timestamp sale_start) {
    this.sale_start = sale_start;
  }

  public java.sql.Timestamp getSale_end() {
    return sale_end;
  }

  public void setSale_end(java.sql.Timestamp sale_end) {
    this.sale_end = sale_end;
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

  public String getId_deleted() {
    return id_deleted;
  }

  public void setId_deleted(String id_deleted) {
    this.id_deleted = id_deleted;
  }
}
