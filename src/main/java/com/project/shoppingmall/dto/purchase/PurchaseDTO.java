package com.project.shoppingmall.dto.purchase;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.project.shoppingmall.entity.BaseTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseDTO extends BaseTime {
    private String p_name;
    private Integer p_price;
    private String p_writer;
    private String p_phone;
}
