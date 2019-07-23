package com.covalense.warehouse.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="item")
public class ItemBean {
	@Id
	private int item_id;
	private String item_name;
	private String description;
	private double cost;
	private int quantity;

}
