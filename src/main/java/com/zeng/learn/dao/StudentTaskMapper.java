package com.zeng.learn.dao;

import com.zeng.learn.model.StudentTask;
import java.util.List;


public interface StudentTaskMapper {
	void saveEntity(StudentTask studentTask);
	
	List<StudentTask> searchEntity();
	
	List<StudentTask> searchEntityByStuId(Integer stuId);
}