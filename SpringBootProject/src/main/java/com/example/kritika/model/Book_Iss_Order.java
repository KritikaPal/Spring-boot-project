package com.example.kritika.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Book_Iss_Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer order_id;
	private Double total_amount;
	private Enum order_status;
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}
	public Enum getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Enum order_status) {
		this.order_status = order_status;
	}
	
	

}
