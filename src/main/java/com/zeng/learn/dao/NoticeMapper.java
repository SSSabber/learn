package com.zeng.learn.dao;


import com.zeng.learn.model.Notice;
import java.util.List;

public interface NoticeMapper {
	void saveEntity(Notice notice);
	
	List<Notice> searchEntity();
	
	void deleteEntity(Integer id);
	
	void updateEntity(Notice notice);
	
	Notice getEntityById(Integer id);
}