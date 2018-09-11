package com.cvt.employeeproject.controller;

import com.cvt.employeeproject.dao.EmployeeDal;
import com.cvt.employeeproject.dao.EmployeeDao;
import com.cvt.employeeproject.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value={"/employee"})
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    private EmployeeDal employeeDal;

    //create
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody EmployeeModel employeeModel){
        employeeDao.save(employeeModel);
    }

    //read
    @RequestMapping(value = "/{all}")
    public List<EmployeeModel> retrieveAllEmployees(@RequestParam int id){
        return employeeDao.findAll();
    }



    //update
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody EmployeeModel employeeModel){
        employeeDao.save(employeeModel);
    }

    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        employeeDao.deleteById(id);
    }

}


