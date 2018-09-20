package com.leavemanagementsystem.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "holiday")
public class Holiday {

        @Column(name = "type")
        String Type;
        @Column(name = "companyid")
        @Id
        String companyId;

    public Holiday() {
    }

    @Column(name = "noofholidays")
        int noOfHolidays;

        public Holiday(String type, String companyId, int noOfHolidays) {
            Type = type;
            this.companyId = companyId;
            this.noOfHolidays = noOfHolidays;
        }

        public String getType() {
            return Type;
        }

        public String getCompanyId() {
            return companyId;
        }

        public void setCompanyId(String companyId) {
            this.companyId = companyId;
        }

        public void setType(String type) {
            Type = type;
        }


        public int getNoOfHolidays() {
            return noOfHolidays;
        }

        public void setNoOfHolidays(int noOfHolidays) {
            this.noOfHolidays = noOfHolidays;
        }

    }


