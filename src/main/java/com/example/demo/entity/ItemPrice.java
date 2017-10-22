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
@Table(name = "item_price")
@Data
public class ItemPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@SequenceGenerator(name = "item_price_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
	private Long id;

	@Column(name="item_id")
	private Long itemId;

	@Column(name="price")
	private Long price;

	@Column(name="include_tax")
	private Long includeTax;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;
}
