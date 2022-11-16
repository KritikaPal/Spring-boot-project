package com.example.kritika.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookIssue {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer book_issue_id;
	private Integer book_id;
	private Integer member_id;
	private Date issue_date;
	private Date return_date;
	private Date date_returned;
	private Double borrow_amount;
	private Double late_return_fee_amount;
	private Integer order_by;
	public Integer getBook_issue_id() {
		return book_issue_id;
	}
	public void setBook_issue_id(Integer book_issue_id) {
		this.book_issue_id = book_issue_id;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public Date getDate_returned() {
		return date_returned;
	}
	public void setDate_returned(Date date_returned) {
		this.date_returned = date_returned;
	}
	public Double getBorrow_amount() {
		return borrow_amount;
	}
	public void setBorrow_amount(Double borrow_amount) {
		this.borrow_amount = borrow_amount;
	}
	public Double getLate_return_fee_amount() {
		return late_return_fee_amount;
	}
	public void setLate_return_fee_amount(Double late_return_fee_amount) {
		this.late_return_fee_amount = late_return_fee_amount;
	}
	public Integer getOrder_by() {
		return order_by;
	}
	public void setOrder_by(Integer order_by) {
		this.order_by = order_by;
	}
	
	

}
