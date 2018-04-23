package es.upm.dit.isst.wifiway.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity 
public class User implements Serializable{
	
	@Id
	private String email;
	private String name;
	private String password;
	
	/*@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE } )//PREGUNTAR
	private List<Punto> puntos;*/
	
	public User() {
		//this.puntos = new ArrayList<Punto>();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
