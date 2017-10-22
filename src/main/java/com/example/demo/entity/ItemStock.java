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
@Table(name = "item_stocks")
@Data
public class ItemStock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	@SequenceGenerator(name = "item_stocks_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
	private Long itemId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stockbase_id")
	@SequenceGenerator(name = "item_stockbase_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
	private Long stockbaseId;

	@Column(name="stock_count")
	private Long stockCount;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;
}
