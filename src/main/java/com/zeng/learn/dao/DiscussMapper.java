package com.zeng.learn.dao;


import com.zeng.learn.model.Discuss;
import java.util.List;

public interface DiscussMapper {

	void saveEntity(Discuss discuss);
	
	List<Discuss> searchEntity();
	
	void deleteEntity(Integer id);
	
	void updateEntity(Discuss discuss);
	
	Discuss getEntityById(Integer id);
}