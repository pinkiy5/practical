package com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.model.Person;
import com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonRepository pr;
	@RequestMapping("/details")
	public List<Person> getPersonDetails(){
		return pr.findAll();
	}
	@RequestMapping("/details/{id}")
	public Person getByPersonId(@PathVariable("id")Long id) {
		return pr.findById(id).get();
	}
	@RequestMapping("/details/update/{id}/{name}")
	public String UpdatePerson(@PathVariable("id")Long id,@PathVariable("name")String name) {
		Person p1 = pr.findById(id).get();
		p1.setName(name);
		pr.save(p1);
		return "Update "+id+" with "+name;
	}
	@RequestMapping("/details/delete/{id}")
	public String deletePerson(@PathVariable("id")Long id) {
		pr.deleteById(id);
		return "Deleted person with id :"+id;
	}

	

	

}
