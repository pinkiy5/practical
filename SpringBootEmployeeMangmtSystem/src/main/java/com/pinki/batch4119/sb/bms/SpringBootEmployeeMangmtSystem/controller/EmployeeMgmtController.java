package com.pinki.batch4119.sb.bms.SpringBootEmployeeMangmtSystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinki.batch4119.sb.bms.SpringBootEmployeeMangmtSystem.model.EmployeeManagement;
import com.pinki.batch4119.sb.bms.SpringBootEmployeeMangmtSystem.repository.EmployeeMgmtRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeMgmtController {
	@Autowired
	EmployeeMgmtRepository emr;
	@PostMapping("/save")
	public void saveEmployee(@RequestBody EmployeeManagement em) {
		emr.save(em);
       }
	@RequestMapping("/details")
	public List<EmployeeManagement> getEmployees(){
		return emr.findAll();
	}
	@RequestMapping("/update/{id}/{empName}")
	public void updateEmloyee(@PathVariable("id")Long id,@PathVariable("empName")String ename) {
		EmployeeManagement emt = emr.findById(id).get();
		emt.setEmpName(ename);
		emr.save(emt);
	}
	@RequestMapping("/details/{id}")
	public EmployeeManagement getById(@PathVariable("id")Long id) {
		return emr.findById(id).get();
	}
	@RequestMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id")Long id) {
		emr.deleteById(id);
	}
	

}
