package com.zeng.learn.dao;

import com.zeng.learn.model.Admin;
import org.springframework.stereotype.Component;

import java.util.Map;

public interface AdminMapper {
	Admin searchEntityByAccount(Map<String, String> map);
}