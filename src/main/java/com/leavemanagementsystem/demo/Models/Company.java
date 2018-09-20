package com.leavemanagementsystem.demo.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
    @Column(name = "companyname")
    @Id
    String companyName;
    @Column(name = "companyid")
    String companyId;
    @Column(name = "type")
    String Type;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Company() {
    }

    @Column(name = "address")
    String Address;

    public String getCompanyName() {
        return companyName;

    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Column(name = "state")
    String State;

    public Company(String companyName, String companyId, String type, String address, String state) {
        this.companyName = companyName;
        this.companyId = companyId;
        Type = type;
        Address = address;
        State = state;
    }
}
