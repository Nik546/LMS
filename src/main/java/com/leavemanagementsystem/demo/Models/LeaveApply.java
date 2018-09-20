package com.leavemanagementsystem.demo.Models;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "leaveapply")
public class LeaveApply {

    public LeaveApply(String username, Date fromDate, Date toDate, String type, String reason, int noOfDays) {
        this.username = username;
        this.fromDate = fromDate;
        this.toDate = toDate;
        Type = type;
        this.reason = reason;
        this.noOfDays = noOfDays;
    }

    @Column(name = "leaveid")
    @GeneratedValue
    @Id
    int LeaveId;

    @Column(name = "username")
        String username;
    @Column(name = "fromdate")
        Date fromDate;
    @Column(name = "todate")
        Date toDate;
    @Column(name = "type")
        String Type;
    @Column(name = "reason")
        String reason;
    @Column(name = "noofdays")
        int noOfDays;
    public int getLeaveId() {
        return LeaveId;
    }

    public void setLeaveId(int leaveId) {
        LeaveId = leaveId;
    }
        public LeaveApply() {
        }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }



    public String getReason() {

            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Date getFromDate() {
            return fromDate;
        }

        public void setFromDate(Date fromDate) {
            this.fromDate = fromDate;
        }

        public Date getToDate() {
            return toDate;
        }

        public void setToDate(Date toDate) {
            this.toDate = toDate;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }
    }


