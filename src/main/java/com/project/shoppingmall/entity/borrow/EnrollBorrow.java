package com.project.shoppingmall.entity.borrow;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="enroll_borrow")
public class EnrollBorrow {
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
