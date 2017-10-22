package com.my.db;

public class ItemStocks {
  private Long item_id;
  private Long stockbase_id;
  private Long stock_count;
  private java.sql.Timestamp created_at;
  private java.sql.Timestamp updated_at;

  public Long getItem_id() {
    return item_id;
  }

  public void setItem_id(Long item_id) {
    this.item_id = item_id;
  }

  public Long getStockbase_id() {
    return stockbase_id;
  }

  public void setStockbase_id(Long stockbase_id) {
    this.stockbase_id = stockbase_id;
  }

  public Long getStock_count() {
    return stock_count;
  }

  public void setStock_count(Long stock_count) {
    this.stock_count = stock_count;
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
