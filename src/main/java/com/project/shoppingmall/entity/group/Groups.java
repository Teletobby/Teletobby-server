package com.project.shoppingmall.entity.group;

import com.project.shoppingmall.entity.BaseTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="group_buying")
public class Groups extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer g_id;
    @Column(nullable = false)
    private String g_title;
    @Column(nullable = false)
    private String g_name;
    @Column(nullable = false)
    private Integer g_member;
    @Column(nullable = false)
    private Date g_dueDate;
    @Column(nullable = false)
    private String g_address;
}
