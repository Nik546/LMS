package com.leavemanagementsystem.demo.Repositories;

import com.leavemanagementsystem.demo.Models.Holiday;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HolidayRepository extends CrudRepository<Holiday,String> {

    public List<Holiday> findAllByCompanyId(String username);
}
