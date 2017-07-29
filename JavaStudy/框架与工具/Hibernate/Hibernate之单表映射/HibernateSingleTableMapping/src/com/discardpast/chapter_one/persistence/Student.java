package com.discardpast.chapter_one.persistence;

import com.discardpast.chapter_three.component.MyAddress;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Blob;
import java.util.Date;

/**
 * Created by discardpast on 17-7-28.
 */

/**
 *
 * JavaBeans设计原则
 *  共有的类
 *  提供公有的不带参数的默认的构造方法
 *  属性私有
 *  属性setter/getter封装
 *
 */
@Entity
public class Student {
    //学生ID
    private Integer sid;
    //学生姓名
    private String sname;
    //学生性别
    private String gender;
    //出生日期
    private Date birthday;
    //学生地址
    private String address;
    //学生照片
    private Blob picture;
    //component地址测试
    private MyAddress myAddress;

    @Id
    @Column(name = "sid")
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "picture")
    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public MyAddress getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(MyAddress myAddress) {
        this.myAddress = myAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sid != null ? !sid.equals(student.sid) : student.sid != null) return false;
        if (sname != null ? !sname.equals(student.sname) : student.sname != null) return false;
        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        if (birthday != null ? !birthday.equals(student.birthday) : student.birthday != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        return picture != null ? picture.equals(student.picture) : student.picture == null;
    }

    @Override
    public int hashCode() {
        int result = sid != null ? sid.hashCode() : 0;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        return result;
    }

    public Student(Integer sid, String sname, String gender, Date birthday, Blob picture) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.birthday = birthday;
        this.picture = picture;
    }

    public Student(Integer sid, String sname, String gender, Date birthday, String address) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public Student() {
    }
}
