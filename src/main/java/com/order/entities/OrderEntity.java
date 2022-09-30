package com.order.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.order.entities.enums.OrderStatus;

@Entity
@Table (name="tb_order")
public class OrderEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	
	private OrderStatus orderStatus;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private UserEntity client;

	public OrderEntity() {

	}

	public OrderEntity(Long id, Instant moment, UserEntity client, OrderStatus orderStatus) {
		super();
		this.orderId = id;
		this.moment = moment;
		this.client = client;
		this.orderStatus = orderStatus;
	}

	public Long getId() {
		return orderId;
	}

	public void setId(Long id) {
		this.orderId = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public UserEntity getClient() {
		return client;
	}

	public void setClient(UserEntity client) {
		this.client = client;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, moment);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderEntity other = (OrderEntity) obj;
		return Objects.equals(orderId, other.orderId) && Objects.equals(moment, other.moment);
	}

}
