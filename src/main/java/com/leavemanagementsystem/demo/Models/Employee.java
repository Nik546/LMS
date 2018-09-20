package com.leavemanagementsystem.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employe")
public class Employee {

        @Column(name = "firstname")
        String firstname;
        @Column(name = "lastname")
        String lastname;
        @Column(name = "mailid")
        String mailid;
        @Column(name = "gender")
        String gender;
        @Column(name = "username")
        @Id
        String username;
    @Column(name = "password")
        String password;
    @Column(name = "companyname")
        String companyName;
    @Column(name = "manager")
        String manager;


        public Employee() {
        }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getFirstname() {
            return firstname;
        }

        public Employee(String firstname, String lastname, String mailid, String gender, String username, String password, String companyName,String manager) {

            this.firstname = firstname;
            this.lastname = lastname;
            this.mailid = mailid;
            this.gender = gender;
            this.username = username;
            this.password = password;
            this.companyName = companyName;
            this.manager=manager;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getMailid() {
            return mailid;
        }

        public void setMailid(String mailid) {
            this.mailid = mailid;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}


