package com.zeng.learn.dao;



import com.zeng.learn.model.TaskQuestion;
import java.util.List;

public interface TaskQuestionMapper {
	void saveEntity(TaskQuestion taskQuestion);
	
	List<TaskQuestion> searchEntity(Integer taskId);
	
	void deleteEntity(Integer id);
	
	void updateEntity(TaskQuestion taskQuestion);
	
	TaskQuestion getEntityById(Integer id);
}