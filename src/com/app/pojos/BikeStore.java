package com.app.pojos;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="BikeStore")
public class BikeStore  {
	private int bikeId;
	private String bikeDescription;
	private String bikeName;
	private String image;
	private float price;
	private Category category;
	private List<Customizing> customizings;
	private List<OrderDetail> orderDetails;
	

	public BikeStore() {
	}


	@Id
	@GeneratedValue
	@Column(name="BikeId")
	public int getBikeId() {
		return this.bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}


	@Column(name="BikeDescription")
	public String getBikeDescription() {
		return this.bikeDescription;
	}

	public void setBikeDescription(String bikeDescription) {
		this.bikeDescription = bikeDescription;
	}


	@Column(name="BikeName")
	public String getBikeName() {
		return this.bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}


	@Column(name="Image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	@Column(name="Price")
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	@ManyToOne
	@JoinColumn(name="BikeCategoryId")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	@OneToMany(mappedBy="bikeStore")
	public List<Customizing> getCustomizings() {
		return this.customizings;
	}

	public void setCustomizings(List<Customizing> customizings) {
		this.customizings = customizings;
	}

	public Customizing addCustomizing(Customizing customizing) {
		getCustomizings().add(customizing);
		customizing.setBikeStore(this);

		return customizing;
	}

	public Customizing removeCustomizing(Customizing customizing) {
		getCustomizings().remove(customizing);
		customizing.setBikeStore(null);

		return customizing;
	}

	@OneToMany(mappedBy="bikeStore")
	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().add(orderDetail);
		orderDetail.setBikeStore(orderDetail.getBikeStore());

		return orderDetail;
	}

	public OrderDetail removeOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().remove(orderDetail);
		orderDetail.setBikeStore(null);

		return orderDetail;
	}

	
	


	@Override
	public String toString() {
		return "BikeStore [bikeDescription=" + bikeDescription + ", bikeName=" + bikeName + ", image=" + image
				+ ", price=" + price + ", category=" + category + "]";
	}
	
	
	

}