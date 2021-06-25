package com.zeng.learn.dao;

import com.zeng.learn.model.College;
import java.util.List;


public interface CollegeMapper {
	void saveColege(College college);
	
	List<College> searchCollege();
	
	void deleteCollege(Integer id);
	
	void updateCollege(College college);
	
	College getCollegeById(Integer id);
}