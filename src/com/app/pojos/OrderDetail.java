package com.app.pojos;
import javax.persistence.*;
@Entity
@Table(name="OrderDetails")
public class OrderDetail  {
	private int id;
	private float price;
	private int qty;
	private float unitPrice;
	private String state;
	private String city;
	private String showroom;
	private Order order;
	private BikeStore bikeStore;

	public OrderDetail() {
	}
	@Id
	@GeneratedValue
	@Column(name="Id")
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="Price")
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	@Column(name="Qty")
	public int getQty() {
		return this.qty;
	}

	
	public void setQty(int qty) {
		this.qty = qty;
	}


	@Column(name="UnitPrice")
	public float getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	@ManyToOne
	@JoinColumn(name="OrderId")
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	@ManyToOne
	@JoinColumn(name="BikeId")
	public BikeStore getBikeStore() {
		return this.bikeStore;
	}
	@Column(name="State")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name="City")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="ShowRoom")
	public String getShowroom() {
		return showroom;
	}
	public void setShowroom(String showroom) {
		this.showroom = showroom;
	}
	public void setBikeStore(BikeStore bikeStore) {
		this.bikeStore = bikeStore;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", price=" + price + ", qty=" + qty + ", unitPrice=" + unitPrice + ", state="
				+ state + ", city=" + city + ", showroom=" + showroom + ", order=" + order + ", bikeStore=" + bikeStore
				+ "]";
	}
	
	

}