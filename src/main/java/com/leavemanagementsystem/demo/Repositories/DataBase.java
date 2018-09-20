package com.leavemanagementsystem.demo.Repositories;


import com.leavemanagementsystem.demo.Models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBase extends CrudRepository<Employee,String> {
}
