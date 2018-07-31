package com.vj.mvc;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jdk.nashorn.internal.objects.annotations.SpecializedFunction;

public class Student {
	@Pattern(regexp="[^0-9]*")
private String name;
@Size(min=2,max=8)
private String hobby;
/*@Max(4444)*/
private long mobile;
/*@Past*/
private Date dob;
private ArrayList<String> skill;

private Address add;
public void setAdd(Address add) {
	this.add = add;
}
public Address getAdd() {
	return add;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public ArrayList<String> getSkill() {
	return skill;
}
public void setSkill(ArrayList<String> skill) {
	this.skill = skill;
}
public void setName(String name) {
	this.name = name;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
public String getName() {
	return name;
}
public String getHobby() {
	return hobby;
}
}
