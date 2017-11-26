package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data
public class ItemStockKeyId  implements Serializable{

	private Long itemId;

	private Long stockbaseId;

}
