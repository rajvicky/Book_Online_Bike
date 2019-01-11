package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.HomeBikeDao;
import com.app.pojos.BikeStore;

@Repository
@Transactional
public class HomeBikeServiceImp implements HomeBikeService {
	@Autowired
	private HomeBikeDao dao;
	@Override
	public List<BikeStore> getAllBike() {
		
		return dao.getAllBike();
	}
	@Override
	public BikeStore getDetailsOfBike(int id) {
		
		return dao.getDetailsOfBike(id);
	}


}
