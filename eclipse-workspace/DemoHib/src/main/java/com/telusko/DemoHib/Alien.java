package com.telusko.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alien_table")
public class Alien {
   @Id
   private int aid;
   private String aname;
  // private AlienName aname;
   private String colour;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getName() {
	return aname;
}
public void setName(String name) {
	this.aname = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public Alien(int aid, String aname, String colour) {
	super();
	this.aid = aid;
	this.aname = aname;
	this.colour = colour;
}
public Alien() {
	super();
	//TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", name=" + aname + ", colour=" + colour + "]";
}

   
}