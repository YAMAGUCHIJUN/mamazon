package com.example.demo;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="accounts")
public class Account implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @SequenceGenerator(name = "account_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
    private long id;

    @Column(name="password")
    private String password;

    @Column(name="name")
    private String name;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="zip_code")
    private String zip_code;

    @Column(name="address")
    private String address;

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getZip_code() {
        return zip_code;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    @Column(name="mail")
    private String mail;

    @Column(name="created_at")
    private String created_at;

    @Column(name="updated_at")
    private String updated_at;

    public void setId(long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
