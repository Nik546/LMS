package com.leavemanagementsystem.demo.Repositories;

import com.leavemanagementsystem.demo.Models.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,String> {
}
