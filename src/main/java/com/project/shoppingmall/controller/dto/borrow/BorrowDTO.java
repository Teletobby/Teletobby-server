package com.project.shoppingmall.controller.dto.borrow;

import com.project.shoppingmall.entity.BaseTime;
import lombok.Getter;

@Getter
public class BorrowDTO extends BaseTime {
    private String b_name;
    private Integer b_price;
    private String b_writer;
    private Integer b_period;
}
