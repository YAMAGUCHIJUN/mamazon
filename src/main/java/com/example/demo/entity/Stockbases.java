package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="stockbases")
@Data
public class Stockbases {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @SequenceGenerator(name = "stock_bases_id_seq", sequenceName = "stock_bases_id_seq", allocationSize = 1)
  @Column(name="id")
  private Long id;

  @Column(name="name")
  private String name;

  @Column(name="created_at")
  private java.sql.Timestamp created_at;

  @Column(name="updated_at")
  private java.sql.Timestamp updated_at;
}
