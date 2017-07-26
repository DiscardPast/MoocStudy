package com.discardpast.chapter_one.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.discardpast.chapter_three.single_primary_key.MyAddress;

import java.sql.Blob;
import java.util.Date;

/**
 * Created by discardpast on 17-7-25.
 */
@Entity
public class Student {

    /**
     * JavaBeans设计原则
     *  共有的类
     *  提供公有的不带参数的默认的构造方法
     *  属性私有
     *  属性setter/getter封装
     */

    //学生id
    private int sid;
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
    
    //自定义地址测试
	private MyAddress myselfaddress;


    public Student() {
    }

    
    
    public Student(int sid, String sname, String gender, Date birthday, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}



	public Student(int sid, String sname, String gender, Date birthday, String address,Blob pircture,MyAddress myselfaddress) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.picture = pircture;
        this.myselfaddress = myselfaddress;
    }

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
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
    
    public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}



	public MyAddress getMyaddress() {
		return myselfaddress;
	}



	public void setMyaddress(MyAddress myselfaddress) {
		this.myselfaddress = myselfaddress;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", birthday=" + birthday
				+ ", address=" + address + ", picture=" + picture + ", myselfaddress=" + myselfaddress + "]";
	}

	

}