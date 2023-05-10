package com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.model;

import jakarta.persistence.*;
@Entity
@Table(name="adhaarinfo")
public class Adhaar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adhaar_id")
	private int id;
	private int adhaarNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdhaarNum() {
		return adhaarNum;
	}
	public void setAdhaarNum(int adhaarNum) {
		this.adhaarNum = adhaarNum;
	}
	public Adhaar(int adhaarNum) {
		super();
		this.adhaarNum = adhaarNum;
	}
	public Adhaar() {
		
	}

}
