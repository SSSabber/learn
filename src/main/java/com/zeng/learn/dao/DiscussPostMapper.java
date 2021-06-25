package com.zeng.learn.dao;

import com.zeng.learn.model.DiscussPost;
import java.util.List;

public interface DiscussPostMapper {
	void saveEntity(DiscussPost discussPost);
	List<DiscussPost> searchEntity(Integer id);
}