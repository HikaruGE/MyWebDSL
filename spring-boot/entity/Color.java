package entity;

import javax.persistence.*;

@Entity
public class Color{

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Color(){}
	
	private String name;
	public String getname(){return name;}
	public void setname(){this.name = name;}
	
	
	}
