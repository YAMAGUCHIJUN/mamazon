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
@Table(name = "order_details")
@Data
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@SequenceGenerator(name = "order_details_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
	private Long id;

	@Column(name="order_id")
	private Long orderId;

	@Column(name="item_id")
	private Long itemId;

	@Column(name="quantity")
	private Long quantity;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;
}
