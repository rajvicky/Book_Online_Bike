package com.app.pojos;
import javax.persistence.*;
@Entity
@Table(name="Customizing")
public class Customizing  {
	private int customizedId;
	private String requirement;
	private BikeStore bikeStore;
	private Customer customer;
	public Customizing() {
	}
	@Id
	@GeneratedValue
	@Column(name="CustomizedId")
	public int getCustomizedId() {
		return this.customizedId;
	}
	public void setCustomizedId(int customizedId) {
		this.customizedId = customizedId;
	}
	@Column(name="Requirement")
	public String getRequirement() {
		return this.requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	@ManyToOne
	@JoinColumn(name="BikeId")
	public BikeStore getBikeStore() {
		return this.bikeStore;
	}
	public void setBikeStore(BikeStore bikeStore) {
		this.bikeStore = bikeStore;
	}
	@ManyToOne
	@JoinColumn(name="CustomerId")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}