package com.discardpast.chapter_three.Persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by discardpast on 17-8-7.
 */
@Entity
public class OrderFrom {
    private int id;
    private Integer customer;
    private Date tradedate;
    private String status;
    private Double amount;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customer")
    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "tradedate")
    public Date getTradedate() {
        return tradedate;
    }

    public void setTradedate(Date tradedate) {
        this.tradedate = tradedate;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public OrderFrom() {
    }

    public OrderFrom(int id, Integer customer, Date tradedate, String status, Double amount) {
        this.id = id;
        this.customer = customer;
        this.tradedate = tradedate;
        this.status = status;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderFrom{" +
                "id=" + id +
                ", customer=" + customer +
                ", tradedate=" + tradedate +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderFrom orderFrom = (OrderFrom) o;

        if (id != orderFrom.id) return false;
        if (customer != null ? !customer.equals(orderFrom.customer) : orderFrom.customer != null) return false;
        if (tradedate != null ? !tradedate.equals(orderFrom.tradedate) : orderFrom.tradedate != null) return false;
        if (status != null ? !status.equals(orderFrom.status) : orderFrom.status != null) return false;
        if (amount != null ? !amount.equals(orderFrom.amount) : orderFrom.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (tradedate != null ? tradedate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
