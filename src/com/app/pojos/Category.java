package com.app.pojos;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="Categories")
public class Category  {
	private int bikeCategoryId;
	private String bikeName;
	private List<BikeStore> bikeStores;

	public Category() {
	}
	@Id
	@GeneratedValue
	@Column(name="BikeCategoryId")
	public int getBikeCategoryId() {
		return this.bikeCategoryId;
	}

	public void setBikeCategoryId(int bikeCategoryId) {
		this.bikeCategoryId = bikeCategoryId;
	}


	@Column(name="BikeName")
	public String getBikeName() {
		return this.bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	@OneToMany(mappedBy="category")
	public List<BikeStore> getBikeStores() {
		return this.bikeStores;
	}

	public void setBikeStores(List<BikeStore> bikeStores) {
		this.bikeStores = bikeStores;
	}

	public BikeStore addBikeStore(BikeStore bikeStore) {
		getBikeStores().add(bikeStore);
		bikeStore.setCategory(this);

		return bikeStore;
	}

	public BikeStore removeBikeStore(BikeStore bikeStore) {
		getBikeStores().remove(bikeStore);
		bikeStore.setCategory(null);

		return bikeStore;
	}

}