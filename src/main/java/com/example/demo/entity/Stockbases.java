package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="stock_bases")
@Data
public class Stockbases {

  @Column(name="id")
  private Long id;

  @Column(name="name")
  private String name;

  @Column(name="created_at")
  private java.sql.Timestamp created_at;

  @Column(name="updated_at")
  private java.sql.Timestamp updated_at;
}
