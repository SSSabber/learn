package com.zeng.learn.model;

import java.util.Date;

public class Discuss {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column discuss.id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column discuss.title
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column discuss.teacher_id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	private Integer teacherId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column discuss.record_time
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	private Date recordTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column discuss.course_id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	private Integer courseId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column discuss.content
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	private String content;
	
	private String courseName;
	
	private String teacherName;
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column discuss.id
	 * @return  the value of discuss.id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column discuss.id
	 * @param id  the value for discuss.id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column discuss.title
	 * @return  the value of discuss.title
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column discuss.title
	 * @param title  the value for discuss.title
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column discuss.teacher_id
	 * @return  the value of discuss.teacher_id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public Integer getTeacherId() {
		return teacherId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column discuss.teacher_id
	 * @param teacherId  the value for discuss.teacher_id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column discuss.record_time
	 * @return  the value of discuss.record_time
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public Date getRecordTime() {
		return recordTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column discuss.record_time
	 * @param recordTime  the value for discuss.record_time
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column discuss.course_id
	 * @return  the value of discuss.course_id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public Integer getCourseId() {
		return courseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column discuss.course_id
	 * @param courseId  the value for discuss.course_id
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column discuss.content
	 * @return  the value of discuss.content
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column discuss.content
	 * @param content  the value for discuss.content
	 * @mbg.generated  Thu Mar 29 20:41:35 CST 2018
	 */
	public void setContent(String content) {
		this.content = content;
	}
}