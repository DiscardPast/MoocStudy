package com.discardpast.chapter_three.Persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by discardpast on 17-8-7.
 */
@Entity
public class OrderItem {
    private int id;
    private Integer orderid;
    private Integer commodity;
    private Double discount;
    private Double actprice;
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
    @Column(name = "orderid")
    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "commodity")
    public Integer getCommodity() {
        return commodity;
    }

    public void setCommodity(Integer commodity) {
        this.commodity = commodity;
    }

    @Basic
    @Column(name = "discount")
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "actprice")
    public Double getActprice() {
        return actprice;
    }

    public void setActprice(Double actprice) {
        this.actprice = actprice;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public OrderItem() {
    }

    public OrderItem(int id, Integer orderid, Integer commodity, Double discount, Double actprice, Double amount) {
        this.id = id;
        this.orderid = orderid;
        this.commodity = commodity;
        this.discount = discount;
        this.actprice = actprice;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderid=" + orderid +
                ", commodity=" + commodity +
                ", discount=" + discount +
                ", actprice=" + actprice +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (id != orderItem.id) return false;
        if (orderid != null ? !orderid.equals(orderItem.orderid) : orderItem.orderid != null) return false;
        if (commodity != null ? !commodity.equals(orderItem.commodity) : orderItem.commodity != null) return false;
        if (discount != null ? !discount.equals(orderItem.discount) : orderItem.discount != null) return false;
        if (actprice != null ? !actprice.equals(orderItem.actprice) : orderItem.actprice != null) return false;
        if (amount != null ? !amount.equals(orderItem.amount) : orderItem.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderid != null ? orderid.hashCode() : 0);
        result = 31 * result + (commodity != null ? commodity.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (actprice != null ? actprice.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
