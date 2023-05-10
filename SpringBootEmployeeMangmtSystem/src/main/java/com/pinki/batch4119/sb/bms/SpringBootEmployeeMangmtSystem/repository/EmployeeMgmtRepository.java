package com.pinki.batch4119.sb.bms.SpringBootEmployeeMangmtSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pinki.batch4119.sb.bms.SpringBootEmployeeMangmtSystem.model.EmployeeManagement;
@Repository
public interface EmployeeMgmtRepository extends JpaRepository<EmployeeManagement,Long> {

}
