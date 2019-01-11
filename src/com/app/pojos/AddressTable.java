package com.app.pojos;
import javax.persistence.*;
@Entity
@Table(name="AddressTable")
public class AddressTable  {
	private int addressId;
	private String street;
	private String city;
	private String country;
	private String state;
	private Integer pincode;
	private Customer customer;

	public AddressTable() {
	}
	@Id
	@GeneratedValue
	@Column(name="AddressId")
	public int getAddressId() {
		return this.addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	@Column(name="Street")
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Column(name="City")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="Country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Column(name="State")
	public String getState() {
		return this.state;
	}

	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public void setState(String state) {
		this.state = state;
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
		return "AddressTable [addressId=" + addressId + ", street=" + street + ", city=" + city + ", country=" + country
				+ ", state=" + state + ", pincode=" + pincode + ", customer=" + customer + "]";
	}

}