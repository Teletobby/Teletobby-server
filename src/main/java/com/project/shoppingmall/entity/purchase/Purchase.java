package com.project.shoppingmall.entity.purchase;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.project.shoppingmall.entity.BaseTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="purchase")
public class Purchase extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer p_id;
    @Column(nullable = false)
    private String p_name;
    @Column(nullable = false)
    private Integer p_price;
    @Column(nullable = false)
    private String p_writer;
    @Column(nullable = false)
    private String p_phone;
}
