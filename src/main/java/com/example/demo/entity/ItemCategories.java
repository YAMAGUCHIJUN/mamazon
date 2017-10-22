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
@Table(name="item_categories")
@Data
public class ItemCategories {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  @SequenceGenerator(name = "item_categories_id_seq", sequenceName = "item_categories_id_seq", allocationSize = 1)
  private Long id;

  @Column(name="parent_category_id")
  private Long parentCategoryId;

  @Column(name="category_depth")
  private Long categoryDepth;

  @Column(name="name")
  private String name;

  @Column(name="created_at")
  private java.sql.Timestamp createdAt;

  @Column(name="update_at")
  private java.sql.Timestamp updatedAt;

  @Column(name="is_deleted")
  private String idDeleted;
}
