package es.upm.dit.isst.wifiway.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity 
public class Wifi implements Serializable{
	
	@Id
	private String ssid;
	
	private String MAC;
	private String type;
	
	
	/*@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE } )//PREGUNTAR
	private List<Point> points;
	*/
	@OneToMany(mappedBy="wifi", fetch = FetchType.EAGER)
	private List<Strength> points;
	
	
	
	
	public Wifi() {
		this.points = new ArrayList<Strength>();
	}
	
	
	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}




	//CHAPUZA
	@Override
	public String toString() {
		return "{(ssid(:(" + ssid + "(,(MAC(:(" + MAC + "(,(type(:(" + type + "(}";
	}


	public String getMAC() {
		return MAC;
	}


	public void setMAC(String mAC) {
		MAC = mAC;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public List<Strength> getPoints() {
		return points;
	}


	public void setPoints(List<Strength> points) {
		this.points = points;
	}
	
	
}