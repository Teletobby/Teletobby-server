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
    private Purchase p_id;
    @Column(nullable = false)
    private String e_name;
    @Column(nullable = false)
    private String e_phone;

}
