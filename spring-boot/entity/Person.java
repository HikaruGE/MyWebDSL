package entity;

import javax.persistence.*;

@Entity
public class Person{

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Person(){}
	
	private String fullname;
	public String getfullname(){return fullname;}
	public void setfullname(){this.fullname = fullname;}
	
	private String email;
	public String getemail(){return email;}
	public void setemail(){this.email = email;}
	
	private String homepage;
	public String gethomepage(){return homepage;}
	public void sethomepage(){this.homepage = homepage;}
	
	private int age;
	public int getage(){return age;}
	public void setage(){this.age = age;}
	
	
	}
