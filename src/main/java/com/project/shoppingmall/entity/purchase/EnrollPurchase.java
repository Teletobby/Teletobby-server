package com.project.shoppingmall.entity.purchase;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="enroll_purchase")
public class EnrollPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer e_seq;

    @ManyToOne
    @JoinColumn(name="e_id")
    private Purchase purchase;
    @Column(nullable = false)
    private String e_name;
    @Column(nullable = false)
    private String e_phone;

    public Integer getE_seq() {
        return e_seq;
    }

    public void setE_seq(Integer e_seq) {
        this.e_seq = e_seq;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_phone() {
        return e_phone;
    }

    public void setE_phone(String e_phone) {
        this.e_phone = e_phone;
    }
}
