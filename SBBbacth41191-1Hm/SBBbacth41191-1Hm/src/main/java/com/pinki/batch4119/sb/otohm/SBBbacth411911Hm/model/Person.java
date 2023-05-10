package com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.model;
import jakarta.persistence.*;
@Entity
@Table(name="person_info")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private long id;
	@Column(name="person_name")
	private String name;
	@Column(name="person_address")
	private String address;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adhaar_id")
	private Adhaar adha;
	public Adhaar getAdha() {
		return adha;
	}
	public void setAdha(Adhaar adha) {
		this.adha = adha;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person() {
		
	}
	

}
