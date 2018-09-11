package com.cvt.employeeproject.dao;

import com.cvt.employeeproject.model.EmployeeModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {
    private EmployeeDal employeeDal;
    private EmployeeModel employeeModel;

    public void save(EmployeeModel employeeModel){
        employeeDal.save(this.employeeModel);
    }
    public List<EmployeeModel> findAll() {
        return employeeDal.findAll();
    }
    public String deleteAll() {
         employeeDal.deleteAll();
         return "All Employee Deleted";
    }


    public String deleteById(int id) {
        employeeDal.deleteById(id);
        return " deleted employee " + id + "successfully";
    }
}
