package com.app.pojos;
import javax.persistence.*;

import com.sun.istack.internal.NotNull;

import java.util.Date;
import java.util.List;
@Entity
@Table(name="Customer")
public class Customer  {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmpassword;
	private int mobileNo;
	private Date registrationDate;
	private String role;
	private List<AddressTable> addressTables;
	private List<Customizing> customizings;
	private List<Order> orders;

	public Customer() {
	}
	public Customer(String firstName, String lastName, String email, String password, int mobileNo, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobileNo = mobileNo;
		this.role = role;
	}
	@Id
	@Column(name="CustomerId")
	@GeneratedValue
	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Column(name="Email",unique=true)
	@NotNull
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="FirstName")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="LastName")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Column(name="MobileNo")
	public int getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Column(name="Password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="RegistrationDate")
	public Date getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


	@Column(name="Role")
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@OneToMany(mappedBy="customer")
	public List<AddressTable> getAddressTables() {
		return this.addressTables;
	}

	public void setAddressTables(List<AddressTable> addressTables) {
		this.addressTables = addressTables;
	}

	public AddressTable addAddressTable(AddressTable addressTable) {
		getAddressTables().add(addressTable);
		addressTable.setCustomer(this);

		return addressTable;
	}

	public AddressTable removeAddressTable(AddressTable addressTable) {
		getAddressTables().remove(addressTable);
		addressTable.setCustomer(null);

		return addressTable;
	}
	@OneToMany(mappedBy="customer")
	public List<Customizing> getCustomizings() {
		return this.customizings;
	}

	public void setCustomizings(List<Customizing> customizings) {
		this.customizings = customizings;
	}

	public Customizing addCustomizing(Customizing customizing) {
		getCustomizings().add(customizing);
		customizing.setCustomer(this);

		return customizing;
	}

	public Customizing removeCustomizing(Customizing customizing) {
		getCustomizings().remove(customizing);
		customizing.setCustomer(null);

		return customizing;
	}
	@OneToMany(mappedBy="customer")
	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setCustomer(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setCustomer(null);

		return order;
	}
}