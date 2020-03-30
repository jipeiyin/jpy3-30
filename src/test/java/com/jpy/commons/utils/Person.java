package com.jpy.commons.utils;

import java.util.Date;
/**
 * 
 * @ClassName: Person 
 * @Description: 实体类
 * @author: 冀培银
 * @date: 2020年3月30日 下午2:35:24
 */
public class Person {
	private String name;
	private Integer age;
	private String about;
	private String created;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
}
