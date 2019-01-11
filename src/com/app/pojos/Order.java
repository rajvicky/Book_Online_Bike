package com.app.pojos;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="Orders")
public class Order  {
	private int orderId;
	private float amount;
	private Date orderDate;
	private List<OrderDetail> orderDetails;
	private Customer customer;

	public Order() {
	}
	@Id
	@GeneratedValue
	@Column(name="OrderId")
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	@Column(name="Amount")
	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OrderDate")
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@OneToMany(mappedBy="order")
	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().add(orderDetail);
		orderDetail.setOrder(this);

		return orderDetail;
	}

	public OrderDetail removeOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().remove(orderDetail);
		orderDetail.setOrder(null);

		return orderDetail;
	}
	@ManyToOne
	@JoinColumn(name="CustomerId")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", orderDate=" + orderDate + ", orderDetails="
				+ orderDetails + ", customer=" + customer + "]";
	}

}