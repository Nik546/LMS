package com.leavemanagementsystem.demo.Services;

import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Repositories.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class EmployeeServices {

    @Autowired
    DataBase dataBase;

    public void register(Employee employee)
    {
        dataBase.save(employee);

    }

    public Employee validate(Employee employee)
    {
        if(dataBase.existsById(employee.getUsername()))
        {
          return dataBase.findById(employee.getUsername()).get();
        };
       return new Employee();
    }

    public List<Employee> getAll()
    {
        List<Employee> list=new ArrayList<>();
        dataBase.findAll().forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                list.add(employee);
            }
        });
        return  list;
    }
    public Employee get1(String username)
    {
        if(dataBase.existsById(username))
        {
            return dataBase.findById(username).get();

        }
        return null;
    }

    public void delete(String userName)
    {
        dataBase.deleteById(userName);
    }


}
