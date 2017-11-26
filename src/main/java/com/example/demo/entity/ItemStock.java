package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "item_stocks")
@IdClass(value=ItemStockKeyId.class)
@Data
public class ItemStock {

	@Id
	@Column(name = "item_id")
	private Long itemId;

	@Id
	@Column(name = "stockbase_id")
	private Long stockbaseId;

	@Column(name="stock_count")
	private Long stockCount;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;
}
