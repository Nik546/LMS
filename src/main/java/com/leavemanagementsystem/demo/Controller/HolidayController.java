package com.leavemanagementsystem.demo.Controller;

import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Models.Holiday;
import com.leavemanagementsystem.demo.Models.LeaveApply;
import com.leavemanagementsystem.demo.Services.HolidayServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HolidayController {

        @Autowired
        HolidayServices holidayService;

        @PostMapping(value = "/addHoliday")
        public void register(@RequestBody Holiday holiday)
        {
            holidayService.add(holiday);
        }



    @PostMapping(value = "/getHoliday")
    public List<Holiday> getAllHoliday(@RequestBody LeaveApply leaveApply)
    {
      return holidayService.getAllHoliday(leaveApply);
    }
}
