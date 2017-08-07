package com.discardpast.chapter_two.One_To_Many.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by discardpast on 17-7-29.
 */
@Entity
public class Grade implements Serializable {
    private int gid;
    private String gname;
    private String gdesc;
    private Set<Student> students = new HashSet<Student>();

    @Id
    @Column(name = "gid")
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "gname")
    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Basic
    @Column(name = "gdesc")
    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Grade() {
    }

    public Grade(String gname, String gdesc) {
        this.gname = gname;
        this.gdesc = gdesc;
    }

    public Grade(int gid, String gname, String gdesc) {
        this.gid = gid;
        this.gname = gname;
        this.gdesc = gdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grade grade = (Grade) o;

        if (gid != grade.gid) return false;
        if (gname != null ? !gname.equals(grade.gname) : grade.gname != null) return false;
        if (gdesc != null ? !gdesc.equals(grade.gdesc) : grade.gdesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gid;
        result = 31 * result + (gname != null ? gname.hashCode() : 0);
        result = 31 * result + (gdesc != null ? gdesc.hashCode() : 0);
        return result;
    }
}
