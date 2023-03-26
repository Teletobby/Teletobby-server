package com.project.shoppingmall.dto;
import com.project.shoppingmall.entity.BaseTime;
import lombok.Getter;

import java.util.Date;

@Getter
public class GroupDTO extends BaseTime {
        private Integer g_id;
        private String g_title;
        private String g_name;
        private Integer g_member;
        private Date g_dueDate;
        private String g_address;

}
