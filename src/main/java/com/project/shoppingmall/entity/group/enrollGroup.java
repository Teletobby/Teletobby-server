package com.project.shoppingmall.entity.group;

import javax.persistence.*;

@Table(name="enroll_group")
public class enrollGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer e_seq;
    @Column(nullable = false)
    private Integer e_id;
    @Column(nullable = false)
    private String e_name;
    @Column(nullable = false)
    private String e_phone;
}
