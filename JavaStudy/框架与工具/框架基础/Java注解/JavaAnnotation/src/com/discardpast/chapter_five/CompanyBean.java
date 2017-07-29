package com.discardpast.chapter_five;

/**
 * Created by discardpast on 17-7-24.
 */
@Table("company")
public class CompanyBean {

    @Column("company_id")
    int company_id;
    @Column("company_name")
    String company_name;
    @Column("company_peoples")
    int company_peoples;
    @Column("company_city")
    String company_city;
    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getCompany_peoples() {
        return company_peoples;
    }

    public void setCompany_peoples(int company_peoples) {
        this.company_peoples = company_peoples;
    }

    public String getCompany_city() {
        return company_city;
    }

    public void setCompany_city(String company_city) {
        this.company_city = company_city;
    }


}
