package com.zeng.learn.model;

import java.util.Date;

public class Task {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.teacher_id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.course_id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.record_time
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    private Date recordTime;
    
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
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.id
     *
     * @return the value of task.id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.id
     *
     * @param id the value for task.id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.teacher_id
     *
     * @return the value of task.teacher_id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.teacher_id
     *
     * @param teacherId the value for task.teacher_id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.course_id
     *
     * @return the value of task.course_id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.course_id
     *
     * @param courseId the value for task.course_id
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.record_time
     *
     * @return the value of task.record_time
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.record_time
     *
     * @param recordTime the value for task.record_time
     *
     * @mbg.generated Thu Mar 29 21:41:54 CST 2018
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}