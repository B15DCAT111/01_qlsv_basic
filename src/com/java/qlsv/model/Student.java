package com.java.qlsv.model;

/**
 * Đối tượng sinh viên cần quản lý
 */
public class Student {
    private Long _id;

    private String code;

    private String name;

    private String address;

    private String email;

    private Double mark;

    public Student() {
    }

    public Student(Long _id, String code, String name, String address, String email, Double mark) {
        this._id = _id;
        this.code = code;
        this.name = name;
        this.address = address;
        this.email = email;
        this.mark = mark;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }
}
