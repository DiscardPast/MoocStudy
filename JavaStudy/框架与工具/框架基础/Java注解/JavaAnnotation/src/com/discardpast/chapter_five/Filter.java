package com.discardpast.chapter_five;

/**
 * Created by discardpast on 17-7-24.
 */

@Table("user")
public class Filter {

    @Column("id")
    private int id;
    @Column("useName")
    private String useName;
    @Column("nickName")
    private String nickName;
    @Column("age")
    private int age;
    @Column("city")
    private String city;
    @Column("e_mail")
    private String e_mail;
    @Column("monile")
    private String monile;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getMonile() {
        return monile;
    }

    public void setMonile(String monile) {
        this.monile = monile;
    }

}
