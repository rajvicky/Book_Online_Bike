package com.app.service;

import java.util.List;

import com.app.pojos.BikeStore;

public interface HomeBikeService {
	public List<BikeStore> getAllBike();
	public BikeStore getDetailsOfBike(int id);

}
