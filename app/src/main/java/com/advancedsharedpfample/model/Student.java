package com.advancedsharedpfample.model;

/**
 * Created by Muhammed Rasheed on 11/7/2017.
 */

public class Student  {

    String name;
    String place;
    long mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Student(String name, String place, long mobile) {

        this.name = name;
        this.place = place;
        this.mobile = mobile;
    }

    public Student() {

    }
}
