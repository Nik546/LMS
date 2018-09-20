package com.leavemanagementsystem.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "approvedleave")
public class ApprovedLeave {



        @Column(name = "leaveid")
        @Id
        int LeaveId;

        public int getLeaveId() {
            return LeaveId;
        }

        public void setLeaveId(int leaveId) {
            LeaveId = leaveId;
        }
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

        public ApprovedLeave() {
        }

        public int getNoOfDays() {
            return noOfDays;
        }

        public void setNoOfDays(int noOfDays) {
            this.noOfDays = noOfDays;
        }

        public ApprovedLeave(int leaveId, String username, Date fromDate, Date toDate, String type, String reason, int noOfDays) {
            LeaveId = leaveId;
            this.username = username;
            this.fromDate = fromDate;
            this.toDate = toDate;
            Type = type;
            this.reason = reason;
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
