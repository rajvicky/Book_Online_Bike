package com.app.pojos;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Payments")
public class Payment  {
	private int paymentId;
	private float amount;
	private int orderId;
	private Date payMentDate;
	private String paymentMode;

	public Payment() {
	}
	@Id
	@GeneratedValue
	@Column(name="PaymentId")
	public int getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	@Column(name="Amount")
	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Column(name="OrderId")
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PayMentDate")
	public Date getPayMentDate() {
		return this.payMentDate;
	}
	public void setPayMentDate(Date payMentDate) {
		this.payMentDate = payMentDate;
	}
	@Column(name="PaymentMode")
	public String getPaymentMode() {
		return this.paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
}