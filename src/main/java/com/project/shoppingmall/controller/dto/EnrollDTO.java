package com.project.shoppingmall.controller.dto;

import com.project.shoppingmall.entity.BaseTime;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class EnrollDTO {
    private String e_id;
    private String e_name;
    private String e_phone;
}
