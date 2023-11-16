package com.stream.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "People_Details")
public class People {
	
	@Id
	@Column(name="user_id")
	private String User_Id;
	@Column(name="first_name")
	private String First_Name;
	@Column(name="last_name")
	private String Last_Name;
	@Column(name="sex")
	private String Sex;
	@Column(name="email")
	private String Email;
	@Column(name="phone")
	private String Phone;
	@Column(name="date_of_birth")
	private String Date_of_birth;
	@Column(name="job_title")
	private String Job_Title;
	
	
	public People(String user_Id, String first_Name, String last_Name, String sex, String email, String phone,
				  String date_of_birth, String job_Title) {
		super();
		User_Id = user_Id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Sex = sex;
		Email = email;
		Phone = phone;
		Date_of_birth = date_of_birth;
		Job_Title = job_Title;
	}

	public People() {

	}


	public String getUser_Id() {
		return User_Id;
	}


	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}


	public String getFirst_Name() {
		return First_Name;
	}


	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}


	public String getLast_Name() {
		return Last_Name;
	}


	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}


	public String getSex() {
		return Sex;
	}


	public void setSex(String sex) {
		Sex = sex;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public String getDate_of_birth() {
		return Date_of_birth;
	}


	public void setDate_of_birth(String date_of_birth) {
		Date_of_birth = String.valueOf(date_of_birth);
	}


	public String getJob_Title() {
		return Job_Title;
	}


	public void setJob_Title(String job_Title) {
		Job_Title = job_Title;
	}


	@Override
	public String toString() {
		return "people [User_Id=" + User_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Sex=" + Sex
				+ ", Email=" + Email + ", Phone=" + Phone + ", Date_of_birth=" + Date_of_birth + ", Job_Title="
				+ Job_Title + "]";
	}
	
	
	
	
	

}
