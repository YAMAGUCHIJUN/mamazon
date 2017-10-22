package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "item_stocks")
public class ItemStocks {
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
	private java.sql.Timestamp createdAt;

	@Column(name="updated_at")
	private java.sql.Timestamp updatedAt;
}
