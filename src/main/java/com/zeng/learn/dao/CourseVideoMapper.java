package com.zeng.learn.dao;


import com.zeng.learn.model.CourseVideo;
import java.util.List;

public interface CourseVideoMapper {
	void saveEntity(CourseVideo collegeVideo);
	
	List<CourseVideo> searchEntity(int id);
	
	List<CourseVideo> searchAllEntity();
	
	CourseVideo getEntityById(Integer id);
	
	void deleteEntity(Integer id);
}