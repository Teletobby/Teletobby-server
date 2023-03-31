package com.project.shoppingmall.entity.group;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="enroll_groups")
public class EnrollGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer e_seq;
    @ManyToOne
    @JoinColumn(name="g_id")
    private Groups e_id;
    @Column(nullable = false)
    private String e_name;
    @Column(nullable = false)
    private String e_phone;
}
