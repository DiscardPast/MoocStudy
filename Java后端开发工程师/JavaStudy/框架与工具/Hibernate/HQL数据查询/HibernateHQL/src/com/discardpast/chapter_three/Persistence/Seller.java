package com.discardpast.chapter_three.Persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by discardpast on 17-8-7.
 */
@Entity
public class Seller {
    private int id;
    private String name;
    private String tel;
    private String address;
    private String wesite;
    private String star;
    private String business;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
    @Column(name = "wesite")
    public String getWesite() {
        return wesite;
    }

    public void setWesite(String wesite) {
        this.wesite = wesite;
    }

    @Basic
    @Column(name = "star")
    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Basic
    @Column(name = "business")
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Seller() {
    }

    public Seller(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public Seller(int id, String name, String tel, String address, String wesite, String star, String business) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.wesite = wesite;
        this.star = star;
        this.business = business;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", wesite='" + wesite + '\'' +
                ", star='" + star + '\'' +
                ", business='" + business + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;

        if (id != seller.id) return false;
        if (name != null ? !name.equals(seller.name) : seller.name != null) return false;
        if (tel != null ? !tel.equals(seller.tel) : seller.tel != null) return false;
        if (address != null ? !address.equals(seller.address) : seller.address != null) return false;
        if (wesite != null ? !wesite.equals(seller.wesite) : seller.wesite != null) return false;
        if (star != null ? !star.equals(seller.star) : seller.star != null) return false;
        if (business != null ? !business.equals(seller.business) : seller.business != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (wesite != null ? wesite.hashCode() : 0);
        result = 31 * result + (star != null ? star.hashCode() : 0);
        result = 31 * result + (business != null ? business.hashCode() : 0);
        return result;
    }
}
