package com.app.dao;
import java.util.List;
import com.app.pojos.BikeStore;
public interface HomeBikeDao {
	public List<BikeStore> getAllBike();
	public BikeStore getDetailsOfBike(int id);
}
