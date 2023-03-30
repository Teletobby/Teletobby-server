package com.project.shoppingmall.entity.borrow;

import com.project.shoppingmall.entity.BaseTime;
import lombok.*;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name="borrow")
public class Borrow extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer b_id;
    @Column(nullable = false)
    private String b_name;
    @Column(nullable = false)
    private Integer b_price;
    @Column(nullable = false)
    private String b_writer;
    @Column(nullable = false)
    private Integer b_period;
}
