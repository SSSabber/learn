package com.zeng.learn.model;

public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.name
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.college_id
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    private Integer collegeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.num
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    private String num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.intro
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    private String intro;
    
    private String collegeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.college_id
     *
     * @return the value of course.college_id
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public Integer getCollegeId() {
        return collegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.college_id
     *
     * @param collegeId the value for course.college_id
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.num
     *
     * @return the value of course.num
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.num
     *
     * @param num the value for course.num
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.intro
     *
     * @return the value of course.intro
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.intro
     *
     * @param intro the value for course.intro
     *
     * @mbg.generated Wed Mar 28 23:26:29 CST 2018
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
    
}