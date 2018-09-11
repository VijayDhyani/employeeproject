package com.cvt.employeeproject.dao;

import com.cvt.employeeproject.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDal extends JpaRepository<EmployeeModel, Integer> {

}
