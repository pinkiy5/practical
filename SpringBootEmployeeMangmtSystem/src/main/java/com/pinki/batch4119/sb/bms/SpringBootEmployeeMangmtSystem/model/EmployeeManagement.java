package com.pinki.batch4119.sb.bms.SpringBootEmployeeMangmtSystem.model;
import jakarta.persistence.*;
@Entity
@Table(name="employee_mgmt")
public class EmployeeManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_mgmt_id")
	private Long id;
	@Column(name="emp_name")
	private String empName;
	private double empSalary;
	private String empAddress;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public EmployeeManagement(String empName, double empSalary, String empAddress) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public EmployeeManagement() {
		
	}

}
