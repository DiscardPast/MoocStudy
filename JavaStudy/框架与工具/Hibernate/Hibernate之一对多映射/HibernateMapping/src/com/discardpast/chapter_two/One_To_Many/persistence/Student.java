package com.discardpast.chapter_two.One_To_Many.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by discardpast on 17-7-29.
 */
@Entity
public class Student implements Serializable{
    private int sid;
    private String sname;
    private String sex;
    private Integer gid;
    private Grade grade;

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
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "gid")
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Student() {
    }

    public Student(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }

    public Student(int sid, String sname, String sex, Integer gid) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.gid = gid;
    }

    public Student(int sid, String sname, String sex, Integer gid, Grade grade) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.gid = gid;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sid != student.sid) return false;
        if (sname != null ? !sname.equals(student.sname) : student.sname != null) return false;
        if (sex != null ? !sex.equals(student.sex) : student.sex != null) return false;
        if (gid != null ? !gid.equals(student.gid) : student.gid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (gid != null ? gid.hashCode() : 0);
        return result;
    }
}
