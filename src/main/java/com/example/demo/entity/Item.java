package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "items")
@Data
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@SequenceGenerator(name = "items_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
	private Long id;

	@Column(name="name")
	private String name;

	@Column(name="category_id")
	private Long categoryId;

	@Column(name="sale_start")
	private Timestamp saleStart;

	@Column(name="sale_end")
	private Timestamp saleEnd;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="id_deleted")
	private String idDeleted;
}
