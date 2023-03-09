package com.project.shoppingmall.entity.borrow;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name="borrow")
public class Borrow {
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
    @Column
    private LocalDateTime b_createDate;

}
